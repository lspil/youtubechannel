package example5;

import java.util.function.Function;

public class Example5 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();

        int x = f1.apply("HELLO!"); // 6

        System.out.println(x);
    }
}
