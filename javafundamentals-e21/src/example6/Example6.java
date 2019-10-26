package example6;

public class Example6 {

    public static void main(String[] args) {

        Instrument i1 = new Instrument() { // implements

            @Override
            public void play() {
                System.out.println("Playing!");
            }
        };

        Instrument i2 = () -> System.out.println("Playing!");

        i1.play();
        i2.play();
    }
}
