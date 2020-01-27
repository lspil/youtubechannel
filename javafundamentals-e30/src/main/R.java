package main;

// A   -->   AutoCloseable  <--  R
//   expects
public class R implements AutoCloseable {

    private String name;

    public R(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println(":) " + name);
    }
}
