public class Example2 {

    public static void main(String[] args) {
        String s1 = """
                      AAA
                          BBB
                              CCC
          """;

        System.out.println(s1);

        String s2 = """
                    aaa
        aaa
        """ + """
                bbb
        """;

        System.out.println(s2);
    }
}
