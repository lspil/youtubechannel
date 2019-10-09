package example6;

public class Example6 {

    public static void main(String[] args) {
//        Playable p = () -> System.out.println(":)");
//
//        p.play();

        Musician m = new Musician(new Piano());
        m.play();
    }
}
