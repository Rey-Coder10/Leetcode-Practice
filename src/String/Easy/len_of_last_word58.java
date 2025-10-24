package String.Easy;

public class len_of_last_word58 {

    static int len_wo(String n) {
        int i = n.length() - 1;


        while (i >= 0 && n.charAt(i) == ' ') {
            i--;
        }

        final int lastindex = i;

        while (i >= 0 && n.charAt(i) != ' ') {
            i--;
        }
        return lastindex - i;
    }


    public static void main(String[] args) {
        String s = "  fly me  to  the moon";
        int ans = len_wo(s);
        System.out.println(ans);
    }
}
