package behaviour_patterns.state;

public class Context {

    private State state;

    public Context() {
        state = State.STATE_A;
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

    public void operation() {
        state.object().opertaion();
        if (state == State.STATE_A)
            setState(State.STATE_B);
    }
}
