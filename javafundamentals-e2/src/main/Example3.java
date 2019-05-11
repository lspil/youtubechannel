package main;

public class Example3 {

    public static void main(String[] args) {
        char c1, c2, c3; // 16-bit

        c1 = 'a';
        c2 = '\n'; // \b \t
        c3 = '\u0065'; // UTF 0065 - e

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c2);

        int i1 = c1;
        int i2 = c2;
        int i3 = c3;
        System.out.print(i1);
        System.out.print(c2);
        System.out.print(i2);
        System.out.print(c2);
        System.out.print(i3);
        System.out.print(c2);
    }
}
