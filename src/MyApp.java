public class MyApp {

    // Injection dans la méthode en question
    public void processMessages(MessageService messageService, String message, String receiver) {
        messageService.sendEmail(message, receiver);
    }
}
