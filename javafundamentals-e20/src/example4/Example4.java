package example4;

import java.util.function.Function;

public class Example4 {

    public static void main(String[] args) {
        // x -> y   encoding  "ABCD" -> "DCBA"
        Reverse r1 = x -> new StringBuilder(x).reverse().toString();
        String y = r1.reverse("ABCD");
        System.out.println(y); // DCBA

        // Function

        Function<String, String> f1 = x -> new StringBuilder(x).reverse().toString();
        String y2 = f1.apply("ABCD");
        System.out.println(y2); // DCBA

        // Function, Predicate, Consumer, BiConsumer ...
    }
}
