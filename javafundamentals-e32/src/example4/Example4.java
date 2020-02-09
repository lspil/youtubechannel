package example4;

public class Example4 {

    public static void main(String[] args) {
        D<String, Integer> d1 = new D<>();

        D<String, Integer> d2 = new D<String, Integer>();

        D<?, Integer> d3 = new D<String, Integer>();
        D<?, ? extends Number> d4 = new D<String, Integer>();

        // D d = new D();
        // D d = new K();


    }
}
