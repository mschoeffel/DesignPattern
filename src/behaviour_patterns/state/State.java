package behaviour_patterns.state;

public enum State {
    STATE_A(new ExplicitStateA()),
    STATE_B(new ExplicitStateB());

    private StateInterface stateObj;

    State(StateInterface stateObj) {
        this.stateObj = stateObj;
    }

    public StateInterface object() {
        return stateObj;
    }
}
