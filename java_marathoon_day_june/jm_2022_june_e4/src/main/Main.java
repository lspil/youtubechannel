package main;

public class Main {

  public static void main(String[] args) {

    Cat c1 = new Cat();
    Cat c2 = new Cat();
    Animal a1 = new Animal();

    System.out.println(c1.getClass()); // Cat.class
    System.out.println(a1.getClass()); // Animal.class

    boolean b1 = c1 instanceof Cat; // true
    boolean b2 = c1 instanceof Animal; // true
    boolean b3 = a1 instanceof Cat; // false
    boolean b4 = a1 instanceof Animal; // true

    boolean b5 = c1.getClass().equals(c2.getClass()); //true
    boolean b6 = c1.getClass().equals(a1.getClass()); //false

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);
    System.out.println(b6);
  }
}
