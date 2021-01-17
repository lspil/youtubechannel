package spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SpringInvocationHandler implements InvocationHandler {

  private final Object aspect;

  public SpringInvocationHandler(Object aspect) {
    this.aspect = aspect;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Class aspectClass = aspect.getClass();
    Method [] m = aspectClass.getDeclaredMethods();

    for (var x : m) {
      if (x.isAnnotationPresent(Around.class)) {
        return x.invoke(aspect);
      }
    }
    return null;
  }
}
