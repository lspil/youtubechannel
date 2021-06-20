package example1;

public interface A {

    default void m() {
        System.out.println(":)");
    }
}
