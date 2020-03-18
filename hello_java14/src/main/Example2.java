package main;

public class Example2 {

    public static void main(String[] args) {
        int x = 10;

        int y = switch (x) {
            case 10,20,30: yield 100;
            default: throw new RuntimeException();
        };
    }
}
