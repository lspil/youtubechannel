package main;

public class Cat {

    final static String x;
    final String name;

    {
        name = "";
        System.out.println("D");
    }

    static {
        x = "";
        System.out.println(x);
    }

    Cat() {
        System.out.println("A cat was created");
    }

    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

    static void sayMeow() {
        System.out.println("Meow!");
    }
}
