package strukturmuster.proxy;

public class Client {

    public static void main(String[] args){
        MailerProxy m = new MailerProxy();

        m.sendMail("empfaenger", "absender", "betreff", "body");
    }

}
