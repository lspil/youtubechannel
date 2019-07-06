package main;

import java.sql.SQLOutput;

public class Example1 {

    public static void main(String[] args) {
        var x = new int[]{1,2,3,4,5};

//        for (int i = 0; i < x.length; i++) {
//            x[i] = 10;
//        }

        for (int a: x) {
            a = 10;
        }

    }
}
