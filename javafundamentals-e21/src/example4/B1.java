package example4;

public class B1 {

    void m1(int k) {
        int q = 10;

        class B2 {

            void m() {
                System.out.println(k);
            }
        }
    }

    static void m2 () { // static context
        // you don't have access to this of B1

        class B3 {

        }
    }
}
