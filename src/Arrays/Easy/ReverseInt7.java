package Arrays.Easy;

//Statement:- Given a signed 32-bit integer x,return x with its digit reversed.If reversing x causes the value to go outside the signed 32-bit integer range
//[-2^31-,2^31-1] then return 0;
public class ReverseInt7 {

    static int rev(int x) {
        int num = x;
        long rev = 0;


        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;

            if (rev > Integer.MAX_VALUE) return 0;
            if (rev < Integer.MIN_VALUE) return 0;


            num /= 10;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        int x = 123;

        int res = rev(x);

        System.out.println("The reverse of a given number is " + res);


    }
}
