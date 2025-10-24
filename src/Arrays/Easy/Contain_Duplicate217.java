package Arrays.Easy;

import java.util.*;

public class Contain_Duplicate217 {
    //    Hashing approach-O(n)
    static boolean duplicate(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!hs.add(arr[i])) return true;
        }
        return false;
    }

    //    Brute force approach-O(n)
    static boolean duplicate2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 14, 18, 22, 22};
        int n = arr.length;

        System.out.println(duplicate(arr, n));
    }
}
