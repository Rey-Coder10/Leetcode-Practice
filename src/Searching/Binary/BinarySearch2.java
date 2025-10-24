package Searching.Binary;

//We are using recursive approach to solve this
public class BinarySearch2 {
    public static int BiSearch(int[] arr, int low, int high, int element) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element)
                return mid;
            if (arr[mid] > element)
                return BiSearch(arr, low, mid - 1, element);

            return BiSearch(arr, mid + 1, high, element);
        }
        return -1;
    }

    public static void main(String[] args) {
//        BinSearch bs=new BinSearch();
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
