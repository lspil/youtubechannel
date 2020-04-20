package main;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

//        var res = x > y ? add(x,y) : multiply(x,y);
//
//        System.out.println(res);

        int z = 100;

        double res = switch (z) {
          case 100 -> add(x,y);
          case 200 -> multiply(x,y);
          default -> 300;
        };

        System.out.println(res);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static double multiply(int x, int y) {
        return x * y;
    }
}
