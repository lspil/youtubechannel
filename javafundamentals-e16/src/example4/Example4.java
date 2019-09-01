package example4;

public class Example4 {

    public static void main(String[] args) {
        A a1 = new A();

        B b2 = new B();
        A a2 = new B();

        b2.x = 10;
        b2.y = 30;

        a2.x = 20;
//        a2.y = 30;

//        int q = (int) 10.5;

    }
}
