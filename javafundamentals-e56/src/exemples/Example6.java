package exemples;

import java.util.concurrent.atomic.AtomicInteger;

public class Example6 {

  public static void main(String[] args) {
    // AtomicBoolean
    // AtomicInteger
    // AtomicLong
    // AtomicReference

    AtomicInteger i1 = new AtomicInteger(10);
    int res = i1.addAndGet(10);

    System.out.println(res);
  }


}
