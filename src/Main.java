import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Le deduging en Java
        System.out.println("Start counting");
        count(10);
        System.out.println("End counting");
    }

    public static void count(int limit) {
        for (int i = 1; i < limit; i++) {
            System.out.println(i);
        }
    }

}