package example1;

public class Example1 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.x = 5;

        Foo f2 = new Foo();
        f2.x = "Hello";

        /// -----

        int x = (int) f2.x;  // ClassCastException

    }
}
