package main;

public class Example1 {

    public static void main(String[] args) {
        int i = 1, j = 1;

        A: while (i <= 3) {

            B: while (j <= 3) {
                System.out.println(":)");
                if (j % 2 == 0) break A;
                j = j + 1;
            }

            i = i + 1;
        }
        // on this line
    }
}
