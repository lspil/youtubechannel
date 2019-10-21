package example5;

public enum Coffee {
    SMALL(10), MEDIUM, BIG("HELLO"); // this is always first in an enum

    private int qty;

    Coffee() { // private by default
        System.out.println(":)");
    }

    Coffee(int qty) {
        this.qty = qty;
    }

    Coffee(String message) {
        this(10);
        System.out.println(message);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

//public final class Coffee {
//
//    public static final Coffee SMALL = new Coffee();
//    public static final Coffee MEDIUM = new Coffee();
//    public static final Coffee BIG = new Coffee();
//
//    private Coffee() {}
//}
