package example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        Integer [] i = new Integer[10];
        System.out.println(i[2]);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(10);
        list2.add(20);

    }
}
