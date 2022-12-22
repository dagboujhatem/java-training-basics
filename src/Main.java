import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Les tableaux dans Java
        // Example 1: les tableaux
        int[] myNumbers = new int[6]; // 6 est la taille du tableau (connu à l'avance)
        myNumbers[0] = 5;
        myNumbers[1] = 85;
        myNumbers[2] = 75;
        myNumbers[3] = 35;
        myNumbers[4] = 65;
        myNumbers[5] = 15;
        // tri d'un tableau
        Arrays.sort(myNumbers); // tri
        System.out.println(Arrays.toString(myNumbers)); // affichage

        // Example 2: using Array shortcut
        int[] integers = {2, 7, 1, 10};
        System.out.println(integers.length);
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        // Example 3: Array multi dimensional
        int[][] matrice = new int[3][3];
        matrice[0][0] = 5;
        System.out.println(Arrays.deepToString(matrice));

        // Example 3: Array multi dimensional shortcut
        int[][] matrice2 = {{1, 3}, {2, 4}, {1, 3}};
        System.out.println("row length : " + matrice2.length);
        System.out.println("col length : " + matrice2[0].length);
        System.out.println(Arrays.deepToString(matrice2));

    }
}