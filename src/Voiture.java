public class Voiture {
    int vitesse;
    String model;

    public Voiture(String model) {
        this.model = model;
        System.out.println("Création d'une nouvelle voiture.");
    }

    public void accelerer() {
        // ajoute 10 miles par heure à la vitesse actuelle
        this.vitesse = vitesse + 10;
        System.out.println(String.format("La voiture %s s'accélère et atteindre un vitesse de %d Klm/H.", this.model, this.vitesse));
    }

    public void freiner() {
        // déduire 10 miles par heure à la vitesse actuelle
        this.vitesse = vitesse - 10;
        System.out.println(String.format("La voiture %s se freine et atteindre un vitesse de %d Klm/H.", this.model, this.vitesse));
    }
}
