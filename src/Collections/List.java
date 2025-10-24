package Collections;

import java.util.*;

//ArrayList Implementation

//ArrayList maintains the order of insertion
public class List {


    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);


//        Iterator

        Iterator<Integer> itr = li.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        for each loop

        for (int i : li) {
            System.out.println(i);
        }
    }

}
