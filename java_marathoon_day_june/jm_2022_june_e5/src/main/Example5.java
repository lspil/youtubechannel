package main;

import java.util.function.Supplier;

public class Example5 {

    // in practice NEVER catch a NullPointerException, or ArithmeticException or...
    static <T> T opt(Supplier<T> statement) {
      return statement.get();
    }

  public static void main(String[] args) {
      opt(null); // causes a NullPointerException

//      Object x1 = opt(() -> null);
//      System.out.println(x1); // null
  }
}
