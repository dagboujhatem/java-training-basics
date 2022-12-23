public class Main {
    public static void main(String[] args) {
        // Polymorphism in java
        Vehicle[] vehicles = {new Car(), new Bus(), new Car()};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

    }

}