package Hashing;


import java.util.*;
//Intersection of two arrays.

public class h3 {

    public static int Intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            if (hs.contains(arr2[j])) {
                count++;
                hs.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        int num = Intersection(arr1, arr2);
        System.out.print("The intersection of two array is: " + num);


    }
}