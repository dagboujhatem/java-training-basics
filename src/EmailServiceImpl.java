public class EmailServiceImpl implements MessageService {
    private String ID;

    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("Email sending with message : " + message + " , To : " + receiver);
    }
}
