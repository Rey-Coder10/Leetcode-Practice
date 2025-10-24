package Arrays.Easy;

public class Search_Insert_Position35 {
    static int Search(int[] arr, int target, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 5;
        int low = 0;
        int high = arr.length - 1;

        int pos = Search(arr, target, low, high);
        System.out.println("The element found at an index " + pos);


    }
}
