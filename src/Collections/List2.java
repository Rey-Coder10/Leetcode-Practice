package Collections;

import java.util.*;

public class List2 {
    public static void main(String[] args) {
        LinkedList<Integer> lin = new LinkedList<>();

        lin.add(1);
        lin.add(2);
        lin.add(3);

        for (int i : lin) {
            System.out.println(i);
        }
    }
}
