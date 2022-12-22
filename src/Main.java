import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        // Les classes en Java (attribut, méthode, contructeur, instance, instanciation)

        // class instantiation
        Cat chat1 = new Cat("Kito", 5);
        Cat chat2 = new Cat("Felix", 2);
        System.out.println(chat1);
        System.out.println(chat2);

        // using Voiture class
        //crée une nouvelle voiture Renault
        Voiture renault = new Voiture("Renault");
        //crée une nouvelle voiture Peugeot
        Voiture peugeot = new Voiture("Peugeot");
        //appelle la méthode d'accélération sur Renault
        renault.accelerer();
        //appelle la méthode d'accélération sur Peugeot
        peugeot.accelerer();
        //maintenant freiner la voiture Renault
        renault.freiner();


    }
}