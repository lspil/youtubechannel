package example3;

import java.io.Console;

public class Example3 {

    public static void main(String[] args) {
        Console c = System.console();

        if (c != null) {
            char [] pass = c.readPassword();
        } else {
            System.out.println("c is null");
        }
    }
}
