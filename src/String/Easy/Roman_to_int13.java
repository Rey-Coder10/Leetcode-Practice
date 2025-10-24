package String.Easy;

import java.util.HashMap;

public class Roman_to_int13 {
    static int roman_to(String s, HashMap<Character, Integer> hm) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && hm.get(s.charAt(i)) < hm.get(s.charAt(i))) {
                res -= hm.get(s.charAt(i));
            } else {
                res += hm.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();

        String s = "XVIII";

        hm.put('I', 1);
        hm.put('X', 10);
        hm.put('C', 100);
        hm.put('M', 1000);
        hm.put('V', 5);
        hm.put('L', 50);
        hm.put('D', 500);

        int ans = roman_to(s, hm);
        System.out.println("Roman to int is " + ans);

    }
}
