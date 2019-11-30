package example2;

public class Example2 {

    public static void main(String[] args) {
        Cat c1 = new Cat(); // here
        // 2 bytes
        Cat c2 = c1;
        c1 = null;

        System.gc(); // Garbage Collector

    }
}
