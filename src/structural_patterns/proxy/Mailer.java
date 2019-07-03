package structural_patterns.proxy;

public class Mailer implements MailerInterface {

    @Override
    public void sendMail(String empfaenger, String absender, String subject, String body) {
        //Send the Mail
        System.out.print("Mail erfolgreich versendet!");
    }
}
