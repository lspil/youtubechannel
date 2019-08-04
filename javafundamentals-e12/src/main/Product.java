package main;

public class Product {

    String name;
    double price;

    Product() {

    }

    Product(String name) {
        this.name = name;
    }

    Product(double price) {
        this.price = price;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
