package structural_patterns.proxy;

public class MailerProxy implements MailerInterface {

    private Mailer mailer;

    public MailerProxy() {
        mailer = new Mailer();
    }

    @Override
    public void sendMail(String target, String sender, String subject, String body) {
        mailer.sendMail(target, sender, subject, body);
    }
}
