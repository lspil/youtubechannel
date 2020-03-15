package example1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example1 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        var d2 = new ArrayDeque<>();
        ArrayDeque<Integer> d3 = new ArrayDeque<>();

        // stacks and queues

        // adding an element at the beginning
        // adding and element at the end
        // retrieve an element from the beginning
        // retrieve an element from the end

        // stack ... LIFO
        // stacks have layers

//        d1.push(3);
//        d1.push(8);
//        d1.push(9);
//        Integer e1 = d1.pop();

//        d1.addFirst(3);
//        d1.addFirst(8);
//        d1.addFirst(9);
//        d1.removeFirst();
        // 9 8 3

//        d1.addLast(10);
//        d1.addLast(78);
//        d1.addLast(50);

//        d1.offer(10);
//        d1.offer(78);
//        d1.offer(50);

        // 10 78 50
        System.out.println(d1); // any collection in the collections fw implements a toStirng()
//        d1.forEach(System.out::println);
    }
}
