package exemples;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Example5 {

  static ReadWriteLock s = new ReentrantReadWriteLock();

  public static void main(String[] args) {
    demo();
  }

  static void demo() {
    try {
      s.writeLock().lock();
      System.out.println(":)");
      demo();
    } finally {
      s.writeLock().unlock();
    }
  }
}
