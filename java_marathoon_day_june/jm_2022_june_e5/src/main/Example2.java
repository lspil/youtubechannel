package main;

public class Example2 {

  public static void main(String[] args) {
    A a1 = new A();

    A a2 = new A() { // anonymous class => anything non-final (classes, interfaces)

      @Override
      public void test() {
        System.out.println(":(");
      }

    };

    a1.test(); // :)
    a2.test(); // :(
  }
}
