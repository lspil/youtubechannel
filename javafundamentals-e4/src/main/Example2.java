package main;

public class Example2 {

    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", 10); // A
        Cat c2 = new Cat("Tom", 10); // B

        // == !=

        boolean b1 = c1 == c2; // false
        boolean b2 = c1 != c2; // true

        System.out.println(b1);
        System.out.println(b2);
    }
}

class Cat {

    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
