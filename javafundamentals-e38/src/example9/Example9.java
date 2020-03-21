package example9;

import java.util.function.UnaryOperator;

public class Example9 {

    public static void main(String[] args) {
        UnaryOperator<Integer> u1 = n -> n + 1;

        int res1 = u1.apply(10); // 11

        UnaryOperator<String> u2 = n ->
                new StringBuilder(n)
                    .reverse().toString();

        String res2 = u2.apply("HELLO"); // OLLEH

        System.out.println(res1);
        System.out.println(res2);
    }
}
