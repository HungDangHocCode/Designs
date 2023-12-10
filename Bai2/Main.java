package Bai2;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 2, 1};

        Sorter sorter = new Sorter(new BubbleSort());
        data = sorter.sort(data);

        // In kết quả sau khi sử dụng BubbleSort
        System.out.println("Sorted using BubbleSort:");
        printArray(data);

        // Sử dụng QuickSort
        sorter.setStrategy(new QuickSort());
        data = sorter.sort(data);

        // In kết quả sau khi sử dụng QuickSort
        System.out.println("Sorted using QuickSort:");
        printArray(data);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

    

