package example2;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty(); // finite

        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9); // finite
//        s2.forEach(System.out::println);

        Supplier<Integer> sup = () -> new Random().nextInt();
        Stream<Integer> s3 = Stream.generate(sup); // inifinite

//        s3.limit(10)
//          .forEach(System.out::println);

        Stream<Integer> s4 = Stream.iterate(1, i -> i + 1); // infinite
//        s4.limit(10)
//          .forEach(System.out::println);

        Stream<Integer> s5 = Stream.iterate(1, // starting with java 9
                                             i -> i <= 10,
                                             i -> i + 1);  // finite

        s5.forEach(System.out::println);
    }

    public List<Integer> m1() {
        // this meth does smth
        return Collections.emptyList();
    }

    public Stream<Integer> m2() {
        // this meth does smth
        return Stream.empty();
    }
}
