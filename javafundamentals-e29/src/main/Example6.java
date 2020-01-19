package main;

public class Example6 {

    public static void main(String[] args) {
        try {
            int x = m();
            System.out.println(x); // 1
        } catch (ArithmeticException e) {
            System.out.println(":)");
        } catch (NullPointerException e) {
            System.out.println(":)");
        } catch (RuntimeException e) {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1/0; // ArithmeticException
        return x;
    }
}
