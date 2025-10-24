package Sorting;

import java.util.Arrays;
//Swaps adjacent elements if they are in the wrong order.

public class Bubble {
    public static void Sort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("No swapping is done it is Sorted Array");
        } else {
            System.out.println("Swapping is done it is not Sorted Array");
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 3};
        System.out.println("Array before sorting is " + Arrays.toString(arr));
        Sort(arr);
        System.out.println("Array after sorting is " + Arrays.toString(arr));

    }
}
