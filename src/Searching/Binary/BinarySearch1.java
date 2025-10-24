package Searching.Binary;

//We are using iterative approach
public class BinarySearch1 {
    public static int BiSearch(int[] arr, int low, int high, int element) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (mid < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Stack.BinSearch bs = new Stack.BinSearch();
        int[] arr = {1, 2, 3, 4, 5};
        int low = 0;
        int high = arr.length - 1;
        int element = 4;
        int result = BiSearch(arr, low, high, element);
        if (result == -1) {
            System.out.println("The element cannot be found");
        } else {
            System.out.println("The element found at index " + result);
        }
    }
}

