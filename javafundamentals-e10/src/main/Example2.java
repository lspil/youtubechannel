package main;

public class Example2 {

    public static void main(String[] args) {
        final int [] x = {1,2,3,4,5};

        x[2] = 10;

        String [] y = {"A", "CB", "D"};

        int [][] z = { {1,2,3}, {2,5}, {1} };
        System.out.println("Z:" + z.length); // 3

        for (int i=0; i < z.length; i++) {
            System.out.println("Z[i]:" + z[i].length); // int[]
        }

    }
}
