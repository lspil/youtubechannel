package controllers;

import org.springframework.stereotype.Component;

@Component
public class DemoController {

  public int doubleValue(int x) {
//    new Exception().printStackTrace();
    return  2*x;
  }
}
