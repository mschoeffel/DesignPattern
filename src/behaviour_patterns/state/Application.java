package behaviour_patterns.state;

public class Application {

    private State state;

    public Application() {
        state = State.RECEIVED;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if (state != this.state) {
            this.state = state;
            System.out.println("State of the object has changed");
        }
    }

    public void notice() {
        state.object().notice();
    }

    public void process() {
        state.object().process();
        if (state == State.RECEIVED)
            setState(State.INVITED);
    }

}
