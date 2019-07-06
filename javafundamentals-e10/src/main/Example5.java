package main;

public class Example5 {

    public static void main(String[] args) {
        // {null, null, null}
        // int [][] x = {null, null, null};
        int [][] x = new int[3][];

        x[0] = new int[]{1};
        x[1] = new int[]{2,3,4};
        x[2] = new int[]{10};

        // { {1}, {2,3,4}, {10} }

        for (int [] i: x) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
