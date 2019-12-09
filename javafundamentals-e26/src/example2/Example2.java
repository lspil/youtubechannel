package example2;

public class Example2 {

    public static void main(String[] args) {
        char c1 = "hello".charAt(0);
        int len = "hello".length(); // length vs length()
        char c2 = "hello".charAt(len-1);

        int [] i1 = {0,1,2};
        int len2 = i1.length;

        int q1 = "abc".compareTo("bcd"); // -
        System.out.println(q1); // A < a


    }
}
