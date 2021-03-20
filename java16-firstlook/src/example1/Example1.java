package example1;

import java.lang.reflect.Proxy;

public class Example1 {

    public static void main(String[] args) {
        A a = (A) Proxy.newProxyInstance(Example1.class.getClassLoader(),
                new Class[]{A.class},
                new CustomInvocationHandler());

        a.m();
    }
}
