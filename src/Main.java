import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // L'instruction break en Java peut être utiliser comme suivant :
        // 1. Lorsque l’instruction break est rencontrée à l’intérieur d’une boucle, la boucle est immédiatement terminée
        //      et le contrôle de programme reprend à l’instruction suivante de la boucle.
        // 2. Il peut être utilisé pour terminer un cas dans l’instruction switch.

        // Example 1:
        for (int var = 100; var >= 10; var--) {
            System.out.print("la valeur de la variable var est : " + var + "\n");
            if (var == 99) {
                break;
            }
        }
        System.out.print("Hors de la boucle for \n");

        // Example 2
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Enter a word :");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("Next")) {
                continue;
            }
            if (input.equalsIgnoreCase("OK")) {
                break;
            }
            System.out.println(input);
        }
    }

}