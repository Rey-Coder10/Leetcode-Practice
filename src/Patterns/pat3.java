package Patterns;

//triangle Star Pattern
public class pat3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
//            space
            for (int j = i; j <= n - 1; j++) {
                System.out.print("  ");

            }
//          star
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
//           space
            for (int j = i; j <= n - 1; j++) {
                System.out.print("  ");

            }
            System.out.println();
        }
    }
}