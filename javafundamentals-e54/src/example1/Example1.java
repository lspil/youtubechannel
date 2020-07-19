package example1;

import java.util.concurrent.ForkJoinPool;

public class Example1 {

  public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool();

    int res = pool.invoke(new FibonacciTask(5));

    System.out.println(res);
  }
}
