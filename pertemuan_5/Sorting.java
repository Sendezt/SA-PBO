package pertemuan_5;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] data = { 7, 1, 3, 5, 2 };

        // Bubble Sort
        SortingDemo.bubbleSort(Arrays.copyOf(data, data.length));

        // Selection Sort
        SortingDemo.selectionSort(Arrays.copyOf(data, data.length));

        // Insertion Sort
        SortingDemo.insertionSort(Arrays.copyOf(data, data.length));

        // Quick Sort
        System.out.println("\n=== Quick Sort ===");
        int[] dataQS = Arrays.copyOf(data, data.length);
        SortingDemo.quickSort(dataQS, 0, dataQS.length - 1);

        // Merge Sort
        System.out.println("\n=== Merge Sort ===");
        int[] dataMS = Arrays.copyOf(data, data.length);
        SortingDemo.mergeSort(dataMS, 0, dataMS.length - 1);
    }
}
