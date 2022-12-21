public class Main {
    public static void main(String[] args) {
        // Le transtypage (appelé aussi "casting" en anglais) de type consiste à affecter une valeur d’un type de données primitif à un autre type.
        // En Java, il existe deux types de transtypage
        // 1- Transtypage implicite vers un type « plus grand » (sans perte de données): ("Upcasting" en anglais)
        //      byte => short => char => int => long => float => double
        // 2- Transtypage explicite vers un type « plus petit » (avec perte de données): ("Downcasting" en anglais)
        //      double => float => long => int => char => short => byte

        // Example 1: Transtypage implicite
        int i = 2;
        double d = i; // Transtypage implicite
        System.out.println(i); // Output: 2
        System.out.println(d); // Output: 2

        // Example 2: Transtypage explicite (casting)
        double d1 = 2.69;
        int i1 = (int) d1;  // Transtypage explicite
        System.out.println(d1); // Output: 2.69
        System.out.println(i1); // Output: 2

        // Le casting peut être appliqué au classes

        // Example 3: Upcasting: classe fille => classe mère, il se fait d’une manière implicite.
        String str1 = "Hello world";
        Object obj = str1; // Pas besoin de cast – cette conversion fonctionne toujours

        // Example 4: Downcasting: classe mère => classe fille, il se fait explicitement.
        String str2 = (String) obj;
        System.out.println(str2);

    }
}