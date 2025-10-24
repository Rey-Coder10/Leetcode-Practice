package Sorting;

//Builds the final sorted array one item at a time.

import java.util.*;

public class Insertion {
    public static void Insert(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        System.out.println("Insertion Sort: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {23, 9, 41, 1, 42, 57};
        int n = arr.length;
        System.out.println("Before sorting: " + Arrays.toString(arr));
        Insert(arr, n);
    }
}
