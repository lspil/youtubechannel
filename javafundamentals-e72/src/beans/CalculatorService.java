package beans;

import spring.Component;

@Component
public class CalculatorService implements Calculator {

  @Override
  public int sum(int x, int y) {
    return x + y;
  }
}
