package Arrays.Medium;

//3 sum problem


import java.util.*;


public class Sum3_15 {
    static List<List<Integer>> threeSum(int[] arr) {
        if (arr == null || arr.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(arr);

        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};


    }
}
