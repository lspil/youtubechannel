package main;

import java.lang.reflect.Proxy;

public class Example1 {

  public static void main(String[] args) {
    Animal a1 = new Cat();

    Animal a2 = (Animal) Proxy.newProxyInstance(
        Example1.class.getClassLoader(),
        new Class[] {Animal.class},
        new AnimalInvocationHandler(a1)
        );

//    Cat c = (Cat) Proxy.newProxyInstance(
//        Example1.class.getClassLoader(),
//        new Class[] {Cat.class},
//        new AnimalInvocationHandler(a1)
//    );

    a1.saySmth(); // Meow
    a2.saySmth(); // :) Meow :|
  }
}
