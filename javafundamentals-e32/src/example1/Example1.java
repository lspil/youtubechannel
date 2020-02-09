package example1;

public class Example1 {

    public static void main(String[] args) {
        A<Integer> a1 = new A<Integer>();
        A<String> a2 = new A<String>();

        A<Number> a3 = new A<>(); // java 7

        A<Number> a4 = new A<>() { // java 9
           // class that extends A
        };
    }
}
