package example1;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdfg"); // 15

        // java.util.function -> Function<T,R>
        // Function<T,T>  --> UnaryOperator<T>
        // Function<T,Boolean> --> Predicate<T>

        var x = list.stream() // "abcd", "qwerty", "asdfg"
            .map(s -> s.length()) // 4, 6, 5
            .reduce(0, (a,b) -> a+b);
            // 0 + 4 = 4
            // 4 + 6 = 10
            // 10 + 5 = 15

        System.out.println(x);
    }
}
