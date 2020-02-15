package example5;

public class Example5 {

    public static void main(String[] args) {
        I<Integer> c1 = new C<>();
        I<String> c2 = new C<>();

        Integer q1 = c1.m1();
        c1.m2(10);

        String q2 = c2.m1();
        c2.m2(":)");
    }
}
