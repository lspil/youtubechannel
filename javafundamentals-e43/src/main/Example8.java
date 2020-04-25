package main;

import java.util.Optional;

public class Example8 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box here

        if (o2.isPresent()) {
            Integer i1 = o2.get(); // make sure the Optional you use isn't empty
        }
    }

    static Integer m() {
        return null;
    }

}
