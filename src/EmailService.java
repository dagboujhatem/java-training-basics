public class EmailService {
    private String ID;

    public void sendEmail(String message, String receiver) {
        System.out.println("Email sending with message : " + message + " , To : " + receiver);
    }
}
