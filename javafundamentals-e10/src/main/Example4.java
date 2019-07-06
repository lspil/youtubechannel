package main;

public class Example4 {

    public static void main(String[] args) {
        int [][] a = new int[][]{ {14}, {13,12}, {1}};

        for (int[] x : a) {
            for (int y: x) {
                System.out.print(y +" ");
            }
            System.out.println();
        }
    }
}
