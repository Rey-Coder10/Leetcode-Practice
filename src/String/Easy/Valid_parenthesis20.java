package String.Easy;

//The problem statement says that if there is opening bracket((,[,{) then it should have a corresponding closing bracket (),],})/

import java.util.Stack;


public class Valid_parenthesis20 {
    static boolean valid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        boolean t = valid(s);

        System.out.println(t);
    }
}
