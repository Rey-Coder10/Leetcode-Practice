package Patterns;

//Solid Diamond Pattern
public class pat7 {
    public static void main(String[] args) {
        int n = 5;
//        Upper Half
        for (int i = 1; i <= n; i++) {
//            space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//            star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            space
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
            System.out.println();
        }
//        Bottom Half
        for (int i = 1; i <= n; i++) {
//            space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
//            star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
//            space
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print("  ");
//            }
            System.out.println();
        }
    }
}
