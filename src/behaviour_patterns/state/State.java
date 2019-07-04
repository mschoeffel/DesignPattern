package behaviour_patterns.state;

public enum State {
    RECEIVED(new Received()),
    INVITED(new Invited());

    private StateInterface stateObj;

    State(StateInterface stateObj) {
        this.stateObj = stateObj;
    }

    public StateInterface object() {
        return stateObj;
    }
}
