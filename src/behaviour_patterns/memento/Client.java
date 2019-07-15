package behaviour_patterns.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        Keeper keeper = new Keeper();

        originator.set("State1");
        originator.set("State2");
        keeper.saveState(originator.saveToMemento(), "state1");

        originator.set("State3");
        keeper.saveState(originator.saveToMemento(), "state2");

        originator.set("State4");

        originator.restoreFromMemento(keeper.getState("state1"));
    }
}

