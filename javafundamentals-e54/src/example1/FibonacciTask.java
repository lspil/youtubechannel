package example1;

import java.util.concurrent.RecursiveTask;

/*
  OCA 8 -> OCP I 11 Exam
  OCP 8 -> OCP II 11 Exam

  f(0)  f(1)  f(2)   f(3)   f(4)    f(5)
  1     1     2      3      5       8

  f(n) = f(n-1) + f(n-2)
 */
public class FibonacciTask extends RecursiveTask<Integer> {

  private final int n;

  public FibonacciTask(int n) {
    this.n = n;
  }

  @Override
  protected Integer compute() {
    if (n <= 1) {
      return 1;
    }

    var t1 = new FibonacciTask(n - 1);
    var t2 = new FibonacciTask(n - 2);

    t1.fork();

    return t2.compute() + t1.join();
  }
}
