package main;

public class Example6 {

    public static void main(String[] args) {
        // OCP 11

        // int, char, String, enum

        int x = 50;

        switch (x) {
            case 1:
                System.out.println("A");
                break;

            case 11:
            case 12:
            case 10:
                System.out.println("B");
                break;
            case 15:
                System.out.println("C");
                break;
        }
    }
}
