package Collections;

import java.util.*;


//Vector is similar to ArrayList and it is used in multithreading scenario
//Vector is slower than ArrayList.

public class List3 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(2);

        v.add(1);
        v.add(2);
        v.add(3);

        for (int i : v) {
            System.out.println(i);
        }


    }
}
