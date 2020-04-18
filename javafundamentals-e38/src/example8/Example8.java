package example8;

import java.util.function.BiPredicate;

public class Example8 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> p = (s, i) -> s.length() == i;

        boolean b1 = p.test("HELLO", 5); // true
        boolean b2 = p.test("HELLO", 7); // false

        System.out.println(b1);
        System.out.println(b2);
    }
}
