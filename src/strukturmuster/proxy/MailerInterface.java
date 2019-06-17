package strukturmuster.proxy;

public interface MailerInterface {
    void sendMail(String empfaenger, String absender, String subject, String body);
}
