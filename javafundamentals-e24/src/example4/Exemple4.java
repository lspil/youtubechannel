package example4;

public class Exemple4 {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        // method that takes a long time to execute
        for (int x = 0; x <= 9 * 100000; x++) {

        }
        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);
    }
}
