package Collections;


//Iterable is an interface
//It has a single method called as Iterator.
import java.util.*;

public class iterator_demo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

//        It runs cuz of iterator implemented by iterables.
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
