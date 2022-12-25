import java.lang.invoke.VarHandle;

public class Main {
    public static void main(String[] args) {
        // le couplage faible en Java
        EmailServiceImpl emailService = new EmailServiceImpl();
        MyApp app = new MyApp();
        // injection par méthode
        app.processMessages(emailService, "Hello", "Daghbouj Hatem");

        // je peux changer aussi le service et refaire la méthode
        // NOTE: généralement c'est utilisé dans les cas ou l'implémentation du service change aec le temps
        // De plus, cette façon gatrantie qu'on peut pas oublier d'appeler le setter avant de faire la méthode
        SMSServiceImpl smsService = new SMSServiceImpl();
        app.processMessages(smsService, "hello", "fom Paris.");
    }

}