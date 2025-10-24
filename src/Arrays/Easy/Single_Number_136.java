package Arrays.Easy;


public class Single_Number_136 {

//    Brute force approach -O(n)
    static int Sin_num(int[] arr, int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count = arr[i];
            }
        }
        return count;
    }

//    Bit manipulation approach-O(n)

    static int Single_num2(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int n = arr.length;
        int res = Sin_num(arr, n);
        System.out.println("Distinct element is " + res);

    }
}
