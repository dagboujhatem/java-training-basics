import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        // L'heritage dans Java (Inheritance of classes)
        var voiture = new Vehicle();
        voiture.start();
        System.out.println(voiture.isStarted());

        // using Car
        var car = new Car("BMW");
        car.start();
        System.out.println(car.isStarted());

    }
}