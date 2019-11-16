package main;


import hello.HelloWorld;

import java.lang.reflect.Constructor;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
//        try {
//            Class<?> c = Class.forName("example.Example");
//            Constructor cons = c.getDeclaredConstructor();
//            Object o = cons.newInstance();
//            System.out.println(o);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        ServiceLoader<HelloWorld> loader = ServiceLoader.load(HelloWorld.class);
        // searches for HelloWorld implementions in module path
        loader.stream() // with all the implementations found in mp
                .forEach(h -> System.out.println(h.get().sayHello()));
        // for each of the implementations we call the sayHello() method
    }
}
