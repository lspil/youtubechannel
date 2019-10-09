package example5;

public class Car {

    private Engine engine;

    public Car() {
        this.engine = Engine.build("electric");
    }
}
