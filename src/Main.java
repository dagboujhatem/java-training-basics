public class Main {
    public static void main(String[] args) {
        // L'opérateur ternaire
        final boolean isActivated = true;
        String accountStatus = isActivated ? "Your acoount is activated" : "Your account is disabled";
        System.out.println(accountStatus); // Output: Your acoount is activated

        // Example 2:
        int x, y;
        x = 10;
        y = (x == 1) ? 20 : 30;
        System.out.println("La valeur de y est:" + y); // Output: La valeur de y est:30
        y = (x == 10) ? 20 : 30;
        System.out.println("La valeur de y est:" + y); // Output: La valeur de y est:20

    }
}