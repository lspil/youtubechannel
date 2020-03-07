package example2;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {
        /*
        Comparable<Dog>  ->  int compareTo(Dog d)
        Comparator<Dog>  ->  int compare(Dog d1, Dog d2)
         */

        Comparator<Dog> c1 = (d1,d2) -> d1.getAge() - d2.getAge();
        Comparator<Dog> c2 = (d1,d2) -> d1.getName().compareTo(d2.getName());

        var set = new TreeSet<Dog>(c2);

        set.add(new Dog("A", 3));
        set.add(new Dog("D", 2));
        set.add(new Dog("C", 1));
        set.add(new Dog("F", 6));

        set.forEach(System.out::println);

        // Collections vs Collection
        // Collection.sort() // does not compile!!!
        // Executor vs Executors
        // File vs Files

    }
}
