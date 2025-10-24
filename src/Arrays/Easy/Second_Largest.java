
package Arrays.Easy;

//It is called as a One Pass Search
//Time Complexity:- O(n)
public class Second_Largest {

    static int sec_lar(int[] arr, int n) {

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int n = arr.length;

        int res = sec_lar(arr, n);

        System.out.println("The second largest element is " + res);
    }
}
