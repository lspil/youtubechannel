package example1;

public class Example3 {

    /*
    Integer extends Number
    Double extends Number
     */
    public static void main(String[] args) {
        Foo<Integer> f1;
        Foo<?> f2; // any object wildcard
        Foo<? extends Number> f3;
        Foo<? super Number> f4;
        Foo<Number> f5;

        f1 = new Foo<Integer>();
        f5 = new Foo<Number>();

        f3 = new Foo<Number>();
        f3 = new Foo<Integer>();
        f3 = new Foo<Double>();
//        f3 = new Foo<String>(); compilation problem

        f4 = new Foo<Number>();
        f4 = new Foo<Object>();
//        f4 = new Foo<Integer>(); compilation problem

        f2 = new Foo<String>();
        f2 = new Foo<Object>();
        f2 = new Foo<Number>();

        // Foo<Object> vs Foo<?>

        Foo<Object> f6 = new Foo<Object>();
        Foo<?> f7 = new Foo<Number>();
    }

    static Foo<Integer> m1() {
        return null;
    }
}
