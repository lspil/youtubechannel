package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example3 {

  public static void main(String[] args) {
    String k = "service.ProductService";

    try {
      Class productServiceClass = Class.forName(k);

      Constructor c = productServiceClass.getDeclaredConstructor();
      c.setAccessible(true);

      Object o = c.newInstance();

      Field [] fields = productServiceClass.getDeclaredFields();
      for (Field f : fields) {
        f.setAccessible(true);
        f.set(o, 1000);
      }

      Method m = productServiceClass.getMethod("printX");
      m.invoke(o);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
