package example4;

public record Point(int x, int y) {

    void printXY() {
        System.out.println(x + " " + y);
    }
}

/**
 public final class Point {
   private final int x, y;

   // constructor

   // getters
 }

 */
