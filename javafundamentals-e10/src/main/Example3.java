package main;

public class Example3 {

    public static void main(String[] args) {
        int [][][] a = { { {1,2}, {} }, {{1}}, {null}, null};
        // length of a is 4

        System.out.println(a.length); // 4

        System.out.println(a[0].length); // 2
        System.out.println(a[1].length); // 1
        System.out.println(a[2].length); // 1

        // NullPointerException
        //System.out.println(a[3].length);
    }
}
