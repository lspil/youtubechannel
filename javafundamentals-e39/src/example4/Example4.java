package example4;

import java.util.List;

public class Example4 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,3,8,9);

        try {
            list.stream()
                    // other ops
                    .forEach(x -> m(x));
        } catch (Exception e) {
            
        }
    }

    static void m(int x) throws Exception {
        if (x % 2 == 0) {
            throw new Exception("");
        }
        System.out.println(":)");
    }
}
