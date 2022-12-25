public class MyApp {
    private MessageService messageService;

    public MyApp() {
    }

    public void processMessages(String message, String receiver) {
        this.messageService.sendEmail(message, receiver);
    }

    // Injection par setter
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
