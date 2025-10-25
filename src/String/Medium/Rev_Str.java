//Reverse words in a string Leetcode-151 string Medium section
package String.Medium;

public class Rev_Str {

    static String rev(String s) {
        String[] str = s.split("\\s+");
        String res = " ";
//        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            res += str[i] + " ";
        }
        return res.trim();
    }


    public static void main(String[] args) {
        String s = "The sky is blue";

        String ans = rev(s);
        System.out.println("The reverse words of given string are: " + ans);
    }
}
