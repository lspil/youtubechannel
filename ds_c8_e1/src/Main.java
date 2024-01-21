public class Main {
    public static void main(String[] args) {
        // 2, 3, , 5, , 7, , , , 11, , 13, ,

        int input = 1000; // number up to which you look for primes

        boolean [] primes = new boolean[input];
        int n = primes.length - 1;

        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
    }
}