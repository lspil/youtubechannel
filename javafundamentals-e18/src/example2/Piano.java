package example2;

public class Piano implements Playable {

    public int y;

    @Override
    public void play() {
        System.out.println("Play!");
    }
}
