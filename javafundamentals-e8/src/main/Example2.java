package main;

public class Example2 {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.name = "Leo";
        c2.name = "Tom";

        System.out.println(c1.name); // Leo
        System.out.println(c2.name);

        c1.name = "Mitzy";

        System.out.println(c1.name); // Mitzy
    }
}
