package beans;

import spring.Around;
import spring.Aspect;
import spring.Component;

@Component
@Aspect
public class MyCalculatorAspect {

  @Around
  public Object m() {
    return 100;
  }
}
