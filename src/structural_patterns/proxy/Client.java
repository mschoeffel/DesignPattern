package structural_patterns.proxy;

public class Client {

    public static void main(String[] args) {
        Subject subject = new ExplicitSubject();
        Subject proxy = new Proxy(subject);
        proxy.operation();
    }

}
