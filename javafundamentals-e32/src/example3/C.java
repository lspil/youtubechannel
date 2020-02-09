package example3;

public class C<N extends Number> {

    public void doSmth(N n) {
        long x = n.longValue();
    }
}
