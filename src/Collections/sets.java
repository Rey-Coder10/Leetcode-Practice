package Collections;

import java.util.*;

//We are using Sets collections.
//Sets does not allow duplicate elements.
//Set->HashSet,LinkedHashSet,TreeSet,EnumSet.
public class sets {

    public static void main(String[] args) {
        Set<Integer> se = new HashSet<>();

        se.add(1);
        se.add(12);
        se.add(24);
        se.add(67);

        System.out.println(se);
    }
}
