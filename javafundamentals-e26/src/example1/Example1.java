package example1;

public class Example1 {

    public static void main(String[] args) {
        String s1 = "HELLO"; // immutable
//        s1 = "WORLD";

        String s2 = "HELLO";

        String s3 = new String("HELLO");

        // x == y  /// equals()

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase("hello")); // true
    }
}
