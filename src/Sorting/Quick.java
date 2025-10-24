package Sorting;

//Quick Sort algorithm using pivot and partition.

//TC is n^2.

import java.util.Arrays;

public class Quick {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, low);

        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        System.out.println("Original array " + Arrays.toString(arr));
        System.out.println();
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("After quick sort: " + Arrays.toString(arr));
    }
}
