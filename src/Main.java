import java.lang.invoke.VarHandle;

public class Main {
    public static void main(String[] args) {
        // les classe abstraite in java
        Vehicle[] vehicles = {new Car(), new Bus(), new Car()};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.accelerate();
        }

        // Tu peux pas instancier une classe abstraite
        // Vehicle v = new Vehicle();

    }

}