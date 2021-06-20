package example5;

public class Example5 {

    public static void main(String[] args) {
        Number n = 10;

        if (n instanceof Integer i) {

            // work with i
        }

        if (n instanceof Integer i && i == 10) {

            // work with i
        }

//        if (n instanceof Integer i & i == 10) {
//
//            // work with i
//        }
    }
}
