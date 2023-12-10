package Bai2;

public class BubbleSort implements SortStrategy {
        @Override
        public int[] sort(int[] array) {
            // Triển khai thuật toán bubble sort
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Hoán đổi phần tử nếu cần
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array;
        }
    }