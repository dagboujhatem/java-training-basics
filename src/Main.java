public class Main {
    public static void main(String[] args) {
        // Les structures répétitives (3 structures)
        // 1. La boucle while
        // 2. La boucle for
        // 3. La boucle do…while

        // Example: La boucle while
        int x = 1;
        while (x < 10) {
            System.out.print("valeur de x : " + x);
            x++;
            System.out.print("\n");
        }
        // Output
        // valeur de x : 1
        // valeur de x : 2
        // valeur de x : 3
        // valeur de x : 4
        // valeur de x : 5
        // valeur de x : 6
        // valeur de x : 7
        // valeur de x : 8
        // valeur de x : 9


        // Example: La boucle for

        for (int x1 = 1; x1 < 10; x1 = x1 + 1) {
            System.out.print("valeur de x : " + x1);
            System.out.print("\n");
        }
        // Output
        // valeur de x : 1
        // valeur de x : 2
        // valeur de x : 3
        // valeur de x : 4
        // valeur de x : 5
        // valeur de x : 6
        // valeur de x : 7
        // valeur de x : 8
        // valeur de x : 9

        // Example: La boucle do…while
        int x2 = 1;
        do {
            System.out.print("valeur de x : " + x2);
            x2++;
            System.out.print("\n");
        } while (x2 < 10);
        // Output
        // valeur de x : 1
        // valeur de x : 2
        // valeur de x : 3
        // valeur de x : 4
        // valeur de x : 5
        // valeur de x : 6
        // valeur de x : 7
        // valeur de x : 8
        // valeur de x : 9

        // Example: La boucle for ... each
        int tab[] = {100, 105, 110, 115, 120};
        int itemIndex = 0;
        for (int item : tab) {
            System.out.println(String.format("la valeur dans la case %d est %d.", itemIndex, item));
            itemIndex++;
        }
        // Output
        // la valeur dans la case 0 est 100.
        // la valeur dans la case 1 est 105.
        // la valeur dans la case 2 est 110.
        // la valeur dans la case 3 est 115.
        // la valeur dans la case 4 est 120.
    }

}