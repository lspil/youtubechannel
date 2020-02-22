package example8;

import java.util.ArrayList;
import java.util.List;

public class Example8 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10); // 0
        list.add(20); // 1
        list.add(34); // 2
        list.add(1);  // 3
        list.add(20); // 4
        list.add(20); // 5

        list.remove((Integer) 20); // 20

        System.out.println(list); // [10,34,1,20,20]
    }
}
