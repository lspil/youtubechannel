package example10;

import java.util.function.BinaryOperator;

public class Example10 {

    public static void main(String[] args) {
        BinaryOperator<Integer> b1 = (a,b) -> a + b;

        int res = b1.apply(10, 30); // 40

        System.out.println(res);
    }
}
