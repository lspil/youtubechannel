package example7;

import java.util.function.Predicate;

public class Example7 {

    public static void main(String[] args) {
        Predicate<Integer> p1 = x -> x % 2 == 0;

        boolean b1 = p1.test(10); // true
        boolean b2 = p1.test(5); // false

        System.out.println(b1);
        System.out.println(b2);
    }
}
