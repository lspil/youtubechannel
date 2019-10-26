package example5;

public class Example5 {

    public static void main(String[] args) {
        int x = 10; // final
        Cat c1 = new Cat() {

            @Override
            public void sayMeow() {
                System.out.println("Meow! Meow! " + x);
            }

        };

        c1.sayMeow(); // Meow!

        Cat c2 = new Cat();
        System.out.println(c2.getClass()); // Cat.class
        System.out.println(c1.getClass());
    }
}
