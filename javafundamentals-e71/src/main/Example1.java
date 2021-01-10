package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Example1 {

  public static void main(String[] args) {
    String k = "service.ProductService";

    // Class
    try {
      Class productServiceClass = Class.forName(k);

      Constructor c = productServiceClass.getDeclaredConstructor();
      c.setAccessible(true);

      Object o = c.newInstance();

      Method m = productServiceClass.getDeclaredMethod("addProduct");
      m.invoke(o);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
