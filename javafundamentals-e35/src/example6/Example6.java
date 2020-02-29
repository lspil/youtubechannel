package example6;

import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Example6 {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(); // ordered
        set.add(10);
        set.add(1000);
        set.add(23);
        set.add(1000);
        set.add(300);
        set.add(256);

        set.forEach(x -> System.out.println(x));
    }
}
