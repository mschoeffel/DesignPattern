package behaviour_patterns.state;

public class Received implements StateInterface {

    public Received() {
    }

    @Override
    public void notice() {
        System.out.println("Application received");
    }

    @Override
    public void process() {
        System.out.println("Entrance of the application processed");
    }
}
