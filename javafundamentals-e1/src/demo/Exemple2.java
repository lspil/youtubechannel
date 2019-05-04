package demo;

public class Exemple2 {

    public static void main(String[] args) {
        // 1xyz - incorrect , xyz1 - correct
        // x yz, x  yz -- incorrect
        // x=yz ---> incorrect
        // x_y ---> correct
        // x$y ---> correct
        Cat c = new Cat(); // default constructor
        c.name = "Tom";
        c.age = 3;
        c.sayMeow(); // Meow! My name is Tom

        var x = new Cat();
        x.name = "Leo";
        x.age = 4;
        x.sayMeow(); // Meow! My name is Leo
    }
}
