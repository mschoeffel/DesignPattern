package structural_patterns.proxy;

public class Client {

    public static void main(String[] args) {
        MailerProxy m = new MailerProxy();

        m.sendMail("target", "sender", "subject", "body");
    }

}
