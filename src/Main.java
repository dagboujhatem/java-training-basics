public class Main {
    public static void main(String[] args) {
        // Les énumérations permettent de définir un ensemble fini de constantes

        // Example: les jours de la semaine
        EJour today = EJour.LUNDI;
        afficherJour(today); // Output: Lundi

    }

    public static void afficherJour(EJour jour) {
        switch (jour) {
            case LUNDI:
                System.out.println("Lundi");
                break;
            case MARDI:
                System.out.println("Mardi");
                break;
            case MERCREDI:
                System.out.println("Mercredi");
                break;
            case JEUDI:
                System.out.println("Jeudi");
                break;
            case VENDREDI:
                System.out.println("Vendredi");
                break;
            case SAMEDI:
                System.out.println("Samedi");
                break;
            case DIMANCHE:
                System.out.println("Dimanche");
                break;
        }
    }
}