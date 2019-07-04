package behaviour_patterns.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.set("State1");
        originator.set("State2");
        Memento memento1 = originator.saveToMemento();
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        Memento memento2 = originator.saveToMemento();
        originator.set("State4");

        originator.restoreFromMemento(memento2);
    }
}

