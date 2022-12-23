public class MyApp {
    private MessageService messageService;

    public MyApp(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String message, String receiver) {
        this.messageService.sendEmail(message, receiver);
    }
}
