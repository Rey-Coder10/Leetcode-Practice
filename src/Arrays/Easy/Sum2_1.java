package Arrays.Easy;

//Two Sum problem

import java.util.Arrays;
import java.util.HashMap;

public class Sum2_1 {

    //    Optimised approach -O(n)
    static int[] TwoS(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int t = target - arr[i];
            if (map.containsKey(t)) {
                return new int[]{map.get(t), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

//    Brute force-O(n^2)

    static int[] twoS(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

//    Using two pointers-O(nlog(n))

    static int[] poi(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] res = poi(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
