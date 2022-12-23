import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        // L'heritage dans Java (Inheritance of classes)
        var voiture = new Vehicle();
        voiture.start();
        print(voiture);

        // using Car
        var car1 = new Car("BMW");
        car1.start();
        print(car1);
    }

    public static void print(Vehicle vehicle) {
        System.out.println(vehicle);
    }
}