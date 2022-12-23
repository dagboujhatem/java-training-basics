public class Main {
    public static void main(String[] args) {
        // L'heritage dans Java (Inheritance of classes)
        Vehicle voiture = new Vehicle();
        voiture.start();
        print(voiture);

        // using Car
        Car car1 = new Car("BMW");
        car1.start();
        print(car1);
    }

    public static void print(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car c = (Car) vehicle; // ClassCastException
            c.setModelName("Audi");
            System.out.println("Down casting");
        }

        System.out.println(vehicle);
    }
}