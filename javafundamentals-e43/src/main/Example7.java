package main;

import java.util.Optional;

public class Example7 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box here

        //Optional<Integer> o2 = Optional.of(null); // <--- using null with of() throws an exception
        //Optional<Integer> o2 = Optional.of(m()); // throws an exception wherever m() return null

        Optional<Integer> o3 = Optional.ofNullable(10);
        Optional<Integer> o4 = Optional.ofNullable(m());

        boolean b1 = o1.isPresent(); // false
        boolean b2 = o2.isPresent(); // true

        System.out.println(b1);
        System.out.println(b2);
    }

    static Integer m() {
        return null;
    }

}
