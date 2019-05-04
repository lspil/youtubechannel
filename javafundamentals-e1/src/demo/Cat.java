package demo;

class Cat {

    String name;
    int age;

    Cat() {
        System.out.println("A cat was created");
    }

    void sayMeow() {
        System.out.println("Meow! My name is " + this.name);
    }
}
