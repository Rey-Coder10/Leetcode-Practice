// It is Largest odd Number in a string problem Leetcode-1903 Easy section
package String.Easy;

public class Largest_Odd {
    // If u want to convert a char into integer simpy -'0' use it will make it to int.
    static String lar_odd(String n) {

        for (int i = n.length() - 1; i >= 0; i--) {
            if ((n.charAt(i) - '0') % 2 != 0) {
                return n.substring(0, i + 1);
            }
        }
        return " ";
    }


    public static void main(String[] args) {
        String str = "35427";

        String res = lar_odd(str);
        System.out.println(res);

    }
}
