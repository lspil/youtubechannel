package example3;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10); // 0
        list.add(20); // 1
        list.add(34); // 2
        list.add(1);  // 3
        list.add(20); // 4
        list.add(20); // 5

        Integer x1 = list.get(3); // 1
        System.out.println(x1); // 1

        Integer x2 = list.get(5); // 20
        System.out.println(x2); // 20

//        Integer x3 = list.get(6); // IndexOutOfBoundsException
//        System.out.println(x2);
    }
}
