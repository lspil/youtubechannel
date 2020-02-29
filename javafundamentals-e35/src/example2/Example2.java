package example2;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(10, 20 ,50);
        Set<Integer> set2 = new HashSet<>(); // not order and not sorted
        Set<Integer> set3 = new LinkedHashSet<>(); // ordered
        Set<Integer> set4 = new TreeSet<>(); // sorted

        Set<Integer> set5 = Arrays.asList(10,20,30)
                .stream().collect(Collectors.toSet());

        // list                vs           set (Set) / SortedSet / NavigableSet
        // orders                           not (always) ordered
        // indexed                          not indexed
        // do allow duplicated              doesn't allow duplicates


    }
}
