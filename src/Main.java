public class Main {
    // Le language Java a été créer par la société Sun en 1995
    public static void main(String[] args) {
        // Les types primitifs dans Java

        // Les booléens
        boolean isActivated = true;
        System.out.println(isActivated);

        // Les entiers
        byte octet = 127; // de -128 à 127
        System.out.println(octet);
        short entierShort = 9;  // de -32768 à 32767
        System.out.println(entierShort);
        int entier = 99999999; //  de - 2_147_483_647 à 2_147_483_646
        System.out.println(entier);
        long entierLong = 92233720;  // au dela ...
        System.out.println(entierLong);

        // Les réels
        float f = 4.6f;
        System.out.println(f);
        double moyenne = 5.5d;
        System.out.println(moyenne);

        // Les caractères
        char lettre = 'A';
        System.out.println(lettre);

        // les chaines de caractères
        String message = "Hello world!";
        System.out.println(message);

        // Les tableaux
        int[] array = {1, 2, 3};
        // Old Syntax to iterate a table
        /** for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
         } */
        for (int j : array) {
            System.out.println(j);
        }

        // Tableau de chaine de caractère
        String[] chaines = {"element 1", "element 2", "element 3"};
        for (String chaine : chaines) {
            System.out.println(chaine);
        }

        // les matrices
        int[][] a = new int[][]{{5, 1}, {6, 2}, {7, 3}};
        // Old Syntax to iterate a table
        /*for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }*/
        // New Syntax to iterate a table
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    } // end main
}