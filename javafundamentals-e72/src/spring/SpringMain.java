package spring;

import beans.Calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;

public class SpringMain {

  public static void main(String[] args) throws Exception {

    Class c1 = Class.forName("beans.CalculatorService");
    Class a1 = Class.forName("beans.MyCalculatorAspect");

    Object calculatorServiceObj = null;
    Object calculatorAspect = null;

    if (c1.isAnnotationPresent(Component.class)) {
      Constructor beanConst = c1.getDeclaredConstructor();
      calculatorServiceObj = beanConst.newInstance();
    }

    if (a1.isAnnotationPresent(Component.class)) {
      Constructor beanConst = a1.getDeclaredConstructor();
      calculatorAspect = beanConst.newInstance();
    }

    if (a1.isAnnotationPresent(Aspect.class)) {
      calculatorServiceObj = Proxy.newProxyInstance(SpringMain.class.getClassLoader(),
          new Class[] {Calculator.class},
          new SpringInvocationHandler(calculatorAspect)
          );
    }

    Calculator r = (Calculator) calculatorServiceObj;
    var res = r.sum(2, 1); // 3 ???
    System.out.println(res); // 100  !!!
  }
}
