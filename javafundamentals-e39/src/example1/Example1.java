package example1;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,3,8,9);

//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        list.stream()
            .filter(x -> x % 2 == 0) // I1
            .forEach(System.out::println); // ::  x -> System.out.println(x)
    }
}
