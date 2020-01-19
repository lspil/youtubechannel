package main;

public class Example3 {

    public static void main(String[] args) {
        int x = m();
        System.out.println(x); // 10
    }

    public static int m() {
        try {
            return 10;
        } finally {
            System.out.println(":)");
        }
    }
}
