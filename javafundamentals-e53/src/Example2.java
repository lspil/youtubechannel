import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Example2 {

  /*
  Having a list of integers, get back the sum for all the values

  [1,2,3,4,5,6]  ===>  21

  f(1)  f(2)  f(3)  f(4)  f(5)  f(6)  f(7)
  1,    1,    2,    3,    5,    8,    13 ...

  f(7) =  13

  f(n) = f(n-1) + f(n-2)

  n-1 = k

  f(n-1) = f(k) = f(k-1) + f(k-2)
   */

  public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool();

    List<Integer> input = List.of(1,2,3,4,5,6,7,8);
    int res = pool.invoke(new SumNumbersRecursiveTask(input));

    System.out.println(res);
  }
}

class SumNumbersRecursiveTask extends RecursiveTask<Integer> {

  private final List<Integer> input;

  public SumNumbersRecursiveTask(List<Integer> input) {
    this.input = input;
  }

  @Override
  protected Integer compute() {
    if (input.size() <= 2) {
      return input.stream().mapToInt(x -> x).sum();
    } else {
      int mid = input.size() / 2; // middle index
      List<Integer> list1 = input.subList(0, mid); // [0, mid)
      List<Integer> list2 = input.subList(mid, input.size()); // [mid, input.size())

      SumNumbersRecursiveTask t1 = new SumNumbersRecursiveTask(list1);
      SumNumbersRecursiveTask t2 = new SumNumbersRecursiveTask(list2);

      t2.fork(); // t2 to be executed on a separate thread

      return t1.compute() + t2.join();
    }
  }
}
