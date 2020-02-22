package example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example6 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10); // 0
        list.add(20); // 1
        list.add(34); // 2
        list.add(1);  // 3
        list.add(20); // 4
        list.add(20); // 5

        Iterator<Integer> i = list.iterator();

        while (i.hasNext()) {
            Integer x = i.next(); // moves the iterator to the next value and returns it
            System.out.println(x);
        }
    }
}
