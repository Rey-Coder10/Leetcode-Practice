package Arrays.Easy;

//The main goal in this is to add 1 in for the given array.

//eg [1,2,3] and target=1 ->[1,2,4]

//special case if we have [9] then it should be ->[1,0]

import java.util.*;

public class plusOne66 {
    static int[] plus(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i++) {
            if (arr[i] < 9) {
                arr[i] += 1;
                return arr;
            } else {
                arr[i] = 0;
            }
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {9};
        int n = arr.length;
        int n2 = 0;
        int[] res = plus(arr, n);
        int[] res2 = plus(arr2, n2);
        System.out.println(Arrays.toString(res2));
    }
}
