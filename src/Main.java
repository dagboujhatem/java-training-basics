import java.lang.invoke.VarHandle;

public class Main {
    public static void main(String[] args) {
        // le couplage faible en Java
        EmailServiceImpl emailService = new EmailServiceImpl();
        MyApp app = new MyApp(emailService);
        app.processMessages("Hello", "Daghbouj Hatem");
    }

}