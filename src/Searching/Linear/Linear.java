package Searching;

//It is a Linear search program

//TC will be O(n)
public class Linear {

    public static void LinSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                System.out.println("The element found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 4;
        LinSearch(arr, x);

    }
}
