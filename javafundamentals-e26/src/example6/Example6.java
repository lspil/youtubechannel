package example6;

public class Example6 {

    public static void main(String[] args) {
        String s1 = "HELLO";
        StringBuilder s2 = new StringBuilder("HELLO");

        s1.concat("WORLD");
        s2.append("WORLD");

        System.out.println(s1); // HELLO
        System.out.println(s2); // HELLOWORLD

        String s3 = """
                    HELLO
                    WORLD
                    """;
    }
}
