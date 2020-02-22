package example5;

import java.util.ArrayList;
import java.util.List;

public class Example5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10); // 0
        list.add(20); // 1
        list.add(34); // 2
        list.add(1);  // 3
        list.add(20); // 4
        list.add(20); // 5

        for (Integer x: list) {
            System.out.println(x);
        }
    }
}
