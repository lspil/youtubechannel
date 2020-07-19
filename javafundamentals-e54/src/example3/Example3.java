package example3;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Example3 {

  int n;
  ReadWriteLock lock = new ReentrantReadWriteLock();

  public void increment() {  // y = 1
    try {
      lock.writeLock().lock();
      n++; // T1
    } finally {
      lock.writeLock().unlock();
    }
  }

  public int get() {   // x = 1000   x / y = 1000
    try {
      lock.readLock().lock();
      return n;
    } finally {
      lock.readLock().unlock();
    }
  }

}
