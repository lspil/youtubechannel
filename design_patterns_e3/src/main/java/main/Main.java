package main;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product.Builder()
                .id(10)
                .name("Beer")
                .build();

        Product p2 = new Product.Builder()
                .name("Beer")
                .build();

        Product p3 = Product.builder()
                .id(10)
                .build();

        User u1 = User.builder()
                .id(10)
                .firstName("Laurentiu")
                .lastName("Spilca")
                .build();

        /*
        Locale e1 = new Locale.Builder()
                .setLanguage("en")
                .build();
         */
    }

}
