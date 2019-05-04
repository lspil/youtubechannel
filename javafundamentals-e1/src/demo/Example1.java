package demo;

public class Example1 {

    public static void main(String[] args) {
        Cat x;
        x = new Cat();

        Cat y = new Cat();

        var z = new Cat();

        x.name = "Tom";
        y.name = "Leo";
        z.name = "Kitty";

        x.age = 1;
        y.age = 3;
        z.age = 2;

        System.out.println(x.name); // Tom
        System.out.println(x.age); // 1
    }
}
