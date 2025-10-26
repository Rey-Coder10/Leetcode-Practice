package Basics;

import java.util.Scanner;

public class Multiply {

    static void multi(int num) {
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " * " + i + " = " + res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int num = sc.nextInt();

        multi(num);
    }
}
