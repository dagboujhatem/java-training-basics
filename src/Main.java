import java.lang.invoke.VarHandle;

public class Main {
    public static void main(String[] args) {
        // le couplage fort dans Java
        MyApp app = new MyApp();
        app.processMessages("Hello", "Daghbouj Hatem");
    }

}