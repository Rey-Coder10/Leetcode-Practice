package Patterns;

//Rotated Triangle Pyramid
public class pat4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
//            space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
//            star
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
//            star
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
