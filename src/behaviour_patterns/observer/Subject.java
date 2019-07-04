package behaviour_patterns.observer;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Observer> observer;

    public Subject() {
        observer = new ArrayList<>();
    }

    public void register(Observer observer) {
        if (!this.observer.contains(observer))
            this.observer.add(observer);
    }

    public void deregister(Observer observer) {
        this.observer.remove(observer);
    }

    public void notice() {
        if (observer != null && !observer.isEmpty())
            observer.forEach(Observer::refresh);
    }
}
