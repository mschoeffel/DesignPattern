package behaviour_patterns.state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.operation();
        context.operation();
    }

}
