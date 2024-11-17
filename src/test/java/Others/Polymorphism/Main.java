package Others.Polymorphism;

public class Main {
    class Vehicle {
        public Vehicle() {
            System.out.println("Vehicle is created");
        }

        public void start() {
            System.out.println("Vehicle is starting");
        }

        public void start(String type) {
            System.out.println(type + " vehicle is starting");
        }
    }

    class Car extends Vehicle {
        public Car() {
            System.out.println("Car is created");
        }

        @Override
        public void start() {
            System.out.println("Car is starting");
        }

        @Override
        public void start(String type) {
            System.out.println(type + " car is starting");
        }

        public void start(String type, int speed) {
            System.out.println(type + " car is starting at " + speed + " mph");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Vehicle v1 = new Vehicle();
            Vehicle v2 = new Car();
            v1.start();             // 1
            v1.start("Electric");   // 2
            v2.start();             // 3
            v2.start("Electric");   // 4
            // v2.start("Electric", 60); // 5 - This line would not work because Vehicle reference can't access the overloaded method with two parameters
        }
    }

}
