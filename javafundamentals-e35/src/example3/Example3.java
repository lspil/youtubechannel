package example3;

import java.util.Set;

public class Example3 {

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(10, 1000, 23, 300, 256);

        for (Integer x : set1) {
            System.out.println(x);
        }
    }
}
