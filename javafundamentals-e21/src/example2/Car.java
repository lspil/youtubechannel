package example2;

public class Car {

    private int x;

    public class Engine {

        public void run() {
            Car.this.x++;
        }

    }

    public int getX() {
        return x;
    }
}
