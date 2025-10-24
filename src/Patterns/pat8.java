package Patterns;

//Solid Half Diamond
public class pat8 {
    public static void main(String[] args) {
        int n = 5;
//        Upper Half
        for (int i = 1; i <= n; i++) {
//            star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
//        Bottom Half
        for (int i = 1; i <= n; i++) {
//            star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
