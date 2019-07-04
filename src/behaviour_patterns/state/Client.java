package behaviour_patterns.state;

public class Client {

    public static void main(String[] args) {
        Application application = new Application();
        application.notice();
        application.process();

        application.notice();
        application.process();
    }

}
