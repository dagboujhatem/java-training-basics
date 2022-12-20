public class Main {
    public static void main(String[] args) {
        // L'opérateur ternaire
        // Example 1: create an account status
        final boolean isActivated = true;
        String accountStatus = isActivated ? "Your acoount is activated" : "Your account is disabled";
        System.out.println(accountStatus); // Output: Your acoount is activated

        // Example 2: create variable assignment
        int x, y;
        x = 10;
        y = (x == 1) ? 20 : 30;
        System.out.println("La valeur de y est:" + y); // Output: La valeur de y est:30
        y = (x == 10) ? 20 : 30;
        System.out.println("La valeur de y est:" + y); // Output: La valeur de y est:20

        // Example 3: Global Syntax
        //  String str = (condition1) ? "A" : (condition2) ? "B" : (condition3) ? "C" : "X";
        int a = 1;
        String str;
        /*
        if (a == 1) {
            str = "A";
        } else if (a == 2) {
            str = "B";
        } else if (a == 3) {
            str = "C";
        } else {
            str = "X";
        }
        System.out.println(str); // Output: A
        */

        str = (a == 1) ? "A" : (a == 2) ? "B" : (a == 3) ? "C" : "X";
        System.out.println(str); // Output: A

    }
}