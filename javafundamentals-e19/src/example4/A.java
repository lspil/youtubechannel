package example4;

public interface A {

    default void m1() {
        // do smth here
        s1();
        // do smth here
    }

    default void m2() {
        // do smth here
        s1();
        // do smth here
    }

    private static void s1() {
        System.out.println("A");
        System.out.println("B");
    }
}
