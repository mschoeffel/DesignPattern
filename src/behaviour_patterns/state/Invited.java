package behaviour_patterns.state;

public class Invited implements StateInterface {

    public Invited() {
    }

    @Override
    public void notice() {
        System.out.println("Candidate will be invited");
    }

    @Override
    public void process() {
        System.out.println("Invitation processed");
    }
}
