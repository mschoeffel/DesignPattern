package behaviour_patterns.token;

public class Memento {
    /** State of the token */
    private final String state;

    public Memento(final String stateToSave) {
        state = stateToSave;
    }

    public String getSavedState() {
        return state;
    }
}
