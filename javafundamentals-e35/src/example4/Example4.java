package example4;

import java.util.HashSet;
import java.util.Set;

public class Example4 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // uses hashCode() / equals()
        set.add(10);
        set.add(1000);
        set.add(23);
        set.add(1000); // this one isn't added to the collection
        set.add(300);
        set.add(256);

        set.forEach(x -> System.out.println(x)); // System.out::println
    }
}
