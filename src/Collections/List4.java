package Collections;


import java.util.*;

//Stack is another useful collection
//It also maintains the order of insertion.


public class List4 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);

        if (!st.isEmpty()) {
            System.out.println("true");
        }
    }

}
