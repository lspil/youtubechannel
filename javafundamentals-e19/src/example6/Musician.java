package example6;

public class Musician {

    private Playable playable;

    public Musician(Playable playable) {
        this.playable = playable;
    }

    public void play() {
        playable.play();
    }
}
