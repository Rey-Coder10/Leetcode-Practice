package Sorting;

//Recursive Bubble Sort.

import java.util.Arrays;

public class Bubble2 {

    static void Bubble(int[] arr, int size) {
        if (size == 1) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            Bubble(arr, size - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 3};
        int size = arr.length;
        Bubble(arr, size);
        System.out.println("Sorted Array :");
        System.out.println(Arrays.toString(arr));
    }
}
