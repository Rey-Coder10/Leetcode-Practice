package Hashing;


//Union of two Arrays.

import java.util.*;

public class h2 {

    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            hs.add(arr2[j]);
        }

        return hs.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        int res = union(arr1, arr2);
        System.out.print("The count of elements are: " + res);

    }
}
