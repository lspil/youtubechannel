package example5;

public class Example5 {

    public static void main(String[] args) {
//        Coffee c1 = Coffee.MEDIUM;
//        c1.setQty(10);
//        System.out.println(c1.getQty());

        Coffee c1 = Coffee.MEDIUM;

        switch (c1) { // int, char, String, enum
            case SMALL:
                System.out.println(":)");
                break;
            case MEDIUM:
                System.out.println(":(");
                break;
        }

        // JPA implementations / Hibernate
        int ordinal = Coffee.MEDIUM.ordinal();
        String name = Coffee.MEDIUM.name(); // "MEDIUM"
        System.out.println(name + " "  + ordinal); // MEDIUM 1

        for (Coffee i: Coffee.values()) { // Coffee[]
            System.out.println(i.name());
        }
    }
}
