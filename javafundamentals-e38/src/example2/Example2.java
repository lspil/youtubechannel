package example2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example2 {

    public static void main(String[] args) {
        // Consumer
        // BiConsumer
        // Supplier
        // Function
        // BiFunction
        // Predicate
        // BiPredicate
        // UniaryOperator
        // BinaryOperator

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello!"); // Hello!

        BiConsumer<Integer, String> c2 = (a,b) -> System.out.println(a + " " + b);
        c2.accept(10, ":)");
    }
}
