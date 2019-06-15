package main;

public class Example6 {

    public static void main(String[] args) {
        var x = 10;

        for (;;) {
            System.out.println(x);
            x--;
            if (x == 0) {
                break;
            }
        }

    }
}
