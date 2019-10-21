package example6;

public enum Seasons {
    SPRING {
        @Override
        public void rains() {
            System.out.println(":(");
        }
    }, SUMMER {
        @Override
        public void rains() {
            System.out.println(":(");
        }
    }, AUTUMN {
        @Override
        public void rains() {
            System.out.println(":(");
        }
    }, WINTER {
        @Override
        public void rains() {
            System.out.println(":(");
        }
    };

    public abstract void rains();
}
