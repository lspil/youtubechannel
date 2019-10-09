package example1;

public class Example1 {

    public static void main(String[] args) {
        B b = new B();

        if (b instanceof A) {
            System.out.println("A");
        }
    }
}
