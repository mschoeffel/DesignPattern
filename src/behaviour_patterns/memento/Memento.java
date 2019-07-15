package behaviour_patterns.memento;

public class Memento {

    private final String state;

    public Memento(final String stateToSave) {
        state = stateToSave;
    }

    public String getSavedState() {
        return state;
    }
}
