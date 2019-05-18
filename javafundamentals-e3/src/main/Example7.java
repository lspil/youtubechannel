package main;

public class Example7 {

    public static void main(String[] args) {
        int x = 10;

        switch (x) {
            case 10,30,40 -> System.out.println(":)");
            case 80 -> System.out.println(":(");
        }

        int y = switch (x) { // 12 - preview; GA 13
           case 10 -> 100;
           case 11 -> 200;
           default -> 300;
        };
    }
}
