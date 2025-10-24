package Patterns;

//Butterfly Pattern
public class pat6 {
    public static void main(String[] args) {
        int n = 5;
//        Upper Half
        for (int i = 0; i <= n; i++) {
//            star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
//            star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        Bottom Half
        for (int i = 1; i <= n; i++) {
//            star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
//            space
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("  ");
            }
//            star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
