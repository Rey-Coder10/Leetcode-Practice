package Arrays.Medium;

import java.util.Arrays;

public class First_and_Last34 {
    static int FirstOccur(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
                continue;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if(arr[mid]<target){
                low = mid + 1;
            }
        }
        return ans;
    }

    static int LastOccur(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
                continue;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if(arr[mid]<target){
                low = mid + 1;
            }
        }
        return ans;
    }

    static void SearchRange(int[] arr, int target) {
        int[] ans = new int[2];

        int fi = FirstOccur(arr, target);
        int la = LastOccur(arr, target);

        ans[0] = fi;
        ans[1] = la;

        System.out.print("The First and Last position is " + Arrays.toString(ans));
    }


    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        SearchRange(arr, target);

    }
}
