package example1;

public class Example1 {

    public static void main(String[] args) {
        Instrument i = () -> System.out.println(":)");

        i.play();
    }
}
