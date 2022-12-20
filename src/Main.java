public class Main {
    public static void main(String[] args) {
        // Les structures conditionnelles

        // Example 1: if…else syntax
        // Output: x est supérieur à y
        int x, y;
        x = 15;
        y = 13;
        if (x > y) {
            System.out.println("x est supérieur à y");
        } else {
            System.out.println("y est supérieur à x");
        }

        // Example 2: nested if…else syntax (if imbriqués)
        // Output: A = 40 et B = 20
        int a = 40;
        int b = 20;
        if (a == 40) {
            if (b == 20) {
                System.out.println("A = 40 et B = 20");
            }
        }

        // Example 3: nested if…elseif ... else  syntax (if multiple case test)
        // Output: L'entier 24 est divisible par 8
        int entier;
        entier = 24;
        if (entier % 5 == 0 && entier % 8 == 0) {
            System.out.println("L'entier " + entier + " est divisible par les 5 et 8");
        } else if (entier % 8 == 0) {
            System.out.println("L'entier " + entier + " est divisible par 8");
        } else if (entier % 5 == 0) {
            System.out.println("L'entier " + entier + " est divisible par 5");
        } else {
            System.out.println("L'entier " + entier + " est non divisible");
        }

        // Example 3: Switch/Case syntax
        // Output: Bonjour
        direBonjour(1);
    }

    static public void direBonjour(int choix) {

        switch (choix) {

            case 1:
                System.out.println("Bonjour");
                break;
            case 2:
                System.out.println("Hello");
                break;

            default:
                System.out.println("Choix incorrect");
                break;
        }

    }
}