package example6;

public class A {

    <T> T m1(T a) {
        return null;
    }

    static <T> T m2(T a) {
        return a;
    }

    <T, G> T m3(G g) {
        return null;
    }

    static <T> void smth(T a, Class<T> c) {
        // does smth
    }

    static <T> T getBean(String name, Class<T> c) {
        return null;
    }

    static Object getBean(String name) {
        return null;
    }



    public static void main(String[] args) {
        smth(10, Integer.class);

        Double d1 = getBean("b1", Double.class); // Class<Double>
        String d2 = getBean("b2", String.class);

        double d3 = (double) getBean("b1"); // ClassCastException
    }
}
