public class Example3 {

    public static void main(String[] args) {
        int x = 10;

        int y = switch (x) {
            case 1,2,3,4: yield 5;
            case 6,7: yield  7;
            default: yield  0;
        };

    }
}
