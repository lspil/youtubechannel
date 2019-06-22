package main;

public class Example5 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        f1.x = 10;
        f2.x = 20;

        System.out.println(f1.x); // 10
        System.out.println(f2.x); // 20

        Foo.y = 10;
        f1.y = 20;
        f2.y = 30;

        System.out.println(Foo.y); // 30
        System.out.println(f1.y); // 30
        System.out.println(f2.y); // 30

        System.out.println(Foo.z);
        //Foo.z = 20;
    }
}
