package example3;

public class Example3 {

    public static void main(String[] args) {
        Z z1 = () -> 5;
        Z z2 = () -> q();
        Z z3 = () -> {
            int e = 10;
            return e;
        };

        Z z4 = () -> q(); // how we override the m() method
        System.out.println(":)");
        int y = z4.m();
        System.out.println(y);
    }

    static int q() {
        return 4;
    }
}
