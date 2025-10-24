package Arrays.Easy;

//Remove the number if =target value and then adjust the element in array
public class Remove_Element27 {

    static int rem(int[] arr, int n, int val) {
        int k = 0;
        for (int i : arr) {
            if (arr[i] != val) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int n = arr.length;
        int val = 2;
        int res = rem(arr, n, val);
        System.out.print(res);

    }
}
