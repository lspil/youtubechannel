package example3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example5 {

    public static void main(String[] args) {
        Map<Integer, String> m1 = new TreeMap<>(
                Collections.reverseOrder());
        // keys are unique

        m1.put(10, "ABC");
        m1.put(20, "QWE");
        m1.put(10, "WWW");
        m1.put(30, "WWW");

        // [10=>WWW, 20=>QWE, 30=>WWW]

//        m1.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println(m1); // is does implement a toString() method
    }
}
