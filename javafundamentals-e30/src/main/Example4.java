package main;

public class Example4 {

    public static void main(String[] args) {
        try (RE r = new RE()) {
            throw new Exception("X");
        } catch (Exception e) {
            System.out.println(e);
            Throwable [] t = e.getSuppressed();
            for (Throwable x : t) {
                System.out.println(x);
            }
        }
    }
}
