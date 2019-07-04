package structural_patterns.proxy;

public class Mailer implements MailerInterface {

    @Override
    public void sendMail(String target, String sender, String subject, String body) {
        //Send the Mail
        System.out.print("Mail sent successfully!");
    }
}
