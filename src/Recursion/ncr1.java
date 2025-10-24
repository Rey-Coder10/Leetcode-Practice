package Recursion;

//ncr problem i.e combination problem using Iterative approach
public class ncr1 {

    //    function for factorial using Recursion
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

//    Combination  ncr

    static int ncr(int n, int r) {
        if (r > n) {
            return 0;
        }

        int f1 = fact(n);
        int f2 = fact(r);
        int f3 = fact(n - r);

        return f1 / f2 * f3;


    }

    static long ncr_recursive(int n, int r) {
        if (r == 0 || r == 1) {
            return 1;
        }

        if (r > n) {
            return 0;
        }

        return ncr_recursive(n - 1, r - 1) + ncr_recursive(n - 1, r);
    }

    public static void main(String[] args) {
        ncr1 nc = new ncr1();
        int n = 10;
        int r = 10;
        System.out.println("result: " + ncr(n, r));
    }
}
