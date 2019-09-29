package example2;

public interface Playable { // abstract

    int x = 10; // public static final

    void play(); // public abstract

    default void m() {
        System.out.println(":)");
    }

    private static void w() {
        System.out.println(":|");
    }

}
