package Recursion;


//When a function calls itself again and again for solving a problem it is known as Recursion.
//It requires a base condition to terminate the function call.
public class Basic_program {

//    printNum:- 54321


    //    PrintNum:-(10-1)
    static void printNum(int num) {

//                base condition

        if (num == 1) {
            System.out.println(num);
        } else {
            System.out.println(num);
            printNum(num - 1);

        }
    }


//    printNum:-(1-10)

    static void printNum2(int num) {
//        Base Condition

        if (num == 10) {
            System.out.println(num);
        } else {
            System.out.println(num);
            printNum2(num + 1);
        }
    }

    //    Sum of n number
    static int sumN(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + sumN(n - 1);
        }
    }

//    Factorial using Recursion

    static int Fact(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * Fact(n - 1);
        }
    }

//    Fibonacci using Recursion

    static int Fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }

//    Sum of array elements.

    static int sumA(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumA(arr, n - 1);
    }


    public static void main(String[] args) {
        System.out.println("Program started!");
//        int num = 10;
//        int num2 = 1;
//        printNum(num);
//        printNum2(num2);
//        int n = 10;
//        System.out.println(sumN(n));
//        int n = 6;
//        System.out.println(Fact(n));
//        int n = 5;
//        System.out.println(Fibo(n));
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(sumA(arr, n));

    }
}
