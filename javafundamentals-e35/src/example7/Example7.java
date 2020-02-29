package example7;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example7 {

    public static void main(String[] args) {
        SortedSet<Integer> set = getSomeSet();
        // no I can assume that elements are sorted
    }

    static SortedSet<Integer> getSomeSet() {
        return new TreeSet<>(); // sorted
    }
}
