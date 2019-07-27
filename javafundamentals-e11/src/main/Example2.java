package main;

public class Example2 {

    public static void main(String[] args) {
        // it is never null
        // in most cases an empty array -> length 0

        System.out.println(args.length);

        for (String p : args) {
            System.out.println(p);
        }
    }
}
