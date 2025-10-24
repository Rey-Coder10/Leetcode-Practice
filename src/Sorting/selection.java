package Sorting;

import java.util.Arrays;
//Repeatedly finds the minimum element and puts it at the beginning.

//Alo known as comparison based sorting algorithm.
public class selection {
    public static void select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("the sorted array is " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array is " + Arrays.toString(arr));
        select(arr);

    }
}
