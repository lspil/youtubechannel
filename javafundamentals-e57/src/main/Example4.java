package main;

import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

		long t1 = System.currentTimeMillis();

		list.parallelStream()
				.map(n -> {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return 2 * n;
				})
				.forEach(System.out::println);

		long t2 = System.currentTimeMillis();

		System.out.println(t2 - t1);
	}
}
