package Bai2;

public class QuickSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        // Triển khai thuật toán quick sort
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // Sắp xếp các phần từ trước và sau phần tử chia
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // Hoán đổi phần tử nếu cần
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Hoán đổi phần tử pivot
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
