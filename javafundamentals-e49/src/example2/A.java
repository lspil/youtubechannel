package example2;

public class A {

    public synchronized void m1() {
      System.out.println("A"); // this -> a
    }

    public synchronized void m2() {
      System.out.println("B"); // this -> a
    }
}
