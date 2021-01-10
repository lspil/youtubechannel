package main;

import annotations.Call;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Example2 {

  public static void main(String[] args) {
    String k = "service.ProductService";

    try {
      Class productServiceClass = Class.forName(k);

      Constructor c = productServiceClass.getDeclaredConstructor();
      c.setAccessible(true);

      Object o = c.newInstance();

      Method[] methods = productServiceClass.getDeclaredMethods();

      for (Method m : methods) {
        if (m.isAnnotationPresent(Call.class)) {
          m.invoke(o);
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
