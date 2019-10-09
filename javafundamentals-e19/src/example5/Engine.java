package example5;

public interface Engine {

    void run();

    static Engine build(String type) {
        return switch (type) {
            case "electric" -> new ElectricEngine();
            case "diesel" -> new DieselEngine();
            default -> throw new IllegalArgumentException();
        };
    }
}
