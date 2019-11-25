package example2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // console input stream

        System.out.print("Name:");
        String name = s.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
