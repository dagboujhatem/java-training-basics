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

    public static void print(Vehicle vehicle) { // vous pouvez aussi utiliser print(Object vehicle)
        System.out.println(vehicle);
    }
}