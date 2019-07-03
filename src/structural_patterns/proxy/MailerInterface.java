package structural_patterns.proxy;

public interface MailerInterface {
    void sendMail(String empfaenger, String absender, String subject, String body);
}
