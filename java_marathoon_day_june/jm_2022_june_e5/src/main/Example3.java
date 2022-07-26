package main;

public class Example3 {

  public static void main(String[] args) {
    int q = 10; // java 7  ---> stack

    // before Java 8
    B b1 = new B() { // anonymous class over an interface   >>> stored in heap

      @Override
      public void test() {
        System.out.println(":) " + q);
      }
    };

    b1.test();

    B b2 = () -> {
      System.out.println(":)");
    };

    b2.test();
  }
}
