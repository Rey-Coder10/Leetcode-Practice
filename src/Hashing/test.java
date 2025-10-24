package Hashing;

public class test {

    public static void Occur(int[] arr, int n) {
        int[] freq = new int[n];
        int counted = -1;
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = counted;
                }
            }
            if (freq[i] != counted)
                freq[i] = count;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != counted) {
                System.out.println("element: " + arr[i] + " frequency: " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        int n = arr.length;

        Occur(arr, n);
    }
}
