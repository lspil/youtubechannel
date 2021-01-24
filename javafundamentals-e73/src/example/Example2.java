package example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Example2 {

  public static void main(String[] args) throws Exception {
    Cat c = new Cat();
    c.setName("Tom");

    Dog d = copyInstance(c, Dog.class);

    System.out.println(d.getDogName()); // Tom
  }

  private static <T> T copyInstance(Object i, Class<T> c) throws Exception {
    Constructor<T> constructor = c.getDeclaredConstructor();
    T res = constructor.newInstance();

    Class inputClass = i.getClass();
    Field[] fields = inputClass.getDeclaredFields();

    for (var f : fields) {
      f.setAccessible(true); // to bypass the fact that the field might be private
      Field [] outputFields = c.getDeclaredFields();

      for (var fo : outputFields) {
        fo.setAccessible(true);

        if (matches(f, fo) &&
            fo.getType().equals(f.getType())) {
            fo.set(res, f.get(i));
        }
      }
    }

    return res;
  }

  private static boolean matches(Field f, Field fo) {
    if (fo.isAnnotationPresent(ObjectAttribute.class)) {
      ObjectAttribute a = fo.getAnnotation(ObjectAttribute.class);
      return a.name().equals(f.getName());
    }
    return fo.getName().equals(f.getName());
  }
}
