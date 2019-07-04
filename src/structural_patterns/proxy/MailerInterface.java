package structural_patterns.proxy;

public interface MailerInterface {
    void sendMail(String target, String sender, String subject, String body);
}
