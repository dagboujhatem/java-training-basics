import java.lang.invoke.VarHandle;

public class Main {
    public static void main(String[] args) {
        // le couplage faible en Java
        EmailServiceImpl emailService = new EmailServiceImpl();
        MyApp app = new MyApp();
        app.setMessageService(emailService); // injection par setter
        app.processMessages("Hello", "Daghbouj Hatem");

        // je peux changer aussi le service et refaire la méthode
        // NOTE: généralement c'est utilisé dans les cas ou l'implémentation du service change aec le temps
        SMSServiceImpl smsService = new SMSServiceImpl();
        app.setMessageService(smsService);
        app.processMessages("hello", "fom Paris.");
    }

}