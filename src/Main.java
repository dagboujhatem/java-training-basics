public class Main {
    public static void main(String[] args) {
        // La classe Math

        // The round method
        int round = Math.round(1.5F);
        System.out.println(round);

        // The ceil method
        // La fonction Math.ceil() retourne le plus petit entier supérieur ou égal au nombre donné.
        int ceil = (int) Math.ceil(1.2F);
        System.out.println(ceil);

        // The floor method
        // La fonction Math.floor() retourne le plus grand entier qui est inférieur ou égal au nombre donné.
        int floor = (int) Math.floor(1.2F);
        System.out.println(floor);

        // The max method
        int max = Math.max(2, 5);
        System.out.println(max);

        // The min method
        int min = Math.min(4, 7);
        System.out.println(min);

        // the random method
        double random = Math.random(); // round between 0 and 1
        System.out.println(random);
    }
}