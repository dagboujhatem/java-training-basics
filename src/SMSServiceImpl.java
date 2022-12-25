public class SMSServiceImpl implements MessageService {
    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("Email sending with message : " + message + " , To : " + receiver);
    }
}
