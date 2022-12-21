import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // La saisie par clavier en Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner votre nom :");
        String fullName = sc.nextLine();

        System.out.println("Donner votre email :");
        String email = sc.next();

        System.out.println("Donner votre age :");
        int age = sc.nextInt();

        System.out.println("Veuillez saisir un mot de passe:");
        String password = sc.nextLine();
        System.out.println("Vous avez saisi : ");
        System.out.println(String.format("{ fullname: %s , email : %s , age: %d, passwprd: %s }", fullName, email, age, password));
    }
}