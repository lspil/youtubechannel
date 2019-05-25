package main;

public class Example7 {

    public static void main(String[] args) {
        // break   vs   continue

        var i = 1;
        while (true) {
            System.out.println(i);
            i = i + 1;
            if (i == 11) {
                break;
            }
        }
    }
}
