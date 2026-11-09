public class EnumDemo {

    enum Planet {
        MERCURY(3.3e23, 2.4e6),
        VENUS(4.9e24, 6.1e6),
        EARTH(6.0e24, 6.4e6);

        private double mass;
        private double radius;

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass() { return mass; }
        public double getRadius() { return radius; }
    }

    enum Operation {
        SUM {
            public int apply(int a, int b) { return a + b; }
        },
        MULTIPLY {
            public int apply(int a, int b) { return a * b; }
        };

        public abstract int apply(int a, int b);
    }

    public static void main(String[] args) {
        System.out.println("=== Практика 1: инициализация ===");
        for (Planet p : Planet.values()) {
            System.out.println(p + ": mass=" + p.getMass() + ", radius=" + p.getRadius());
        }

        System.out.println("\n=== Практика 2: метод apply ===");
        System.out.println("2 + 3 = " + Operation.SUM.apply(2, 3));
        System.out.println("2 * 3 = " + Operation.MULTIPLY.apply(2, 3));
    }
}
