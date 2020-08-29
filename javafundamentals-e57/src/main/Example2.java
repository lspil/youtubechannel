package main;

public class Example2 {

	private final static ThreadLocal<Transaction> local =
		new ThreadLocal<>();

	public static void main(String[] args) {

	}

	void m1() {
		Transaction t = new Transaction();
		local.set(t);
		m2();
	}

	void m2() {
		local.get();
		// t
	}
}

class Transaction { // DB transaction

}
