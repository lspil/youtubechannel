package example3;

public interface B {

    default void m() {
        System.out.println("B");
    }
}
