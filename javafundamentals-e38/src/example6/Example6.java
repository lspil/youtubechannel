package example6;

import java.util.function.BiFunction;

public class Example6 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> f = (a,b) -> a + "" + b;

        String res = f.apply(5, 9); // 59

        System.out.println(res);
    }
}
