import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        // L'heritage dans Java (Inheritance of classes)
        var voiture = new Vehicle();
        voiture.start();
        System.out.println(voiture.isStarted());

        // using Car
        var car1 = new Car("BMW");
        car1.start();
        System.out.println(car1.isStarted());

        var car2 = new Car("KIA");
        car2.start();
        System.out.println(car2.isStarted());

        // Les méthodes de la classe object
        // hashcode
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        // toString
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        // isEqual
        System.out.println(car1.equals(car1));
        System.out.println(car1.equals(car2));
    }
}