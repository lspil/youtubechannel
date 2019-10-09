package example3;

public interface A {

    default void m() {
        System.out.println("A");
    }
}
