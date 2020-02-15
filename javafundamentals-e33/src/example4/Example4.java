package example4;

public class Example4 {

    public static void main(String[] args) {
        B<Integer, String> b1 = new B<>();

        b1.a = ":)";
        b1.b = 10;

        A<Integer, String> a1 = new B<String, Integer>();
        A<? extends Number, ?> a2 = new B<String, Double>();
    }
}
