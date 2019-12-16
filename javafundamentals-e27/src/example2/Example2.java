package example2;

import example1.Cat;

import java.lang.reflect.Constructor;

public class Example2 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("example1.Cat");
        Constructor<Cat> c2= c.getDeclaredConstructor();
        Cat x = c2.newInstance();
        // creating an instance of a class with reflection

        Class q = x.getClass(); // any instance has this behavior


    }
}
