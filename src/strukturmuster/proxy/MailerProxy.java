package strukturmuster.proxy;

public class MailerProxy implements MailerInterface {

    private Mailer mailer;

    public MailerProxy(){
        mailer = new Mailer();
    }

    @Override
    public void sendMail(String empfaenger, String absender, String subject, String body) {
        mailer.sendMail(empfaenger, absender, subject, body);
    }
}
