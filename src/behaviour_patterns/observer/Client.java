package behaviour_patterns.observer;

public class Client {

    public static void main(String[] args) {

        ExplicitSubject explicitSubject = new ExplicitSubject();
        explicitSubject.setData("My Data 1");
        ExplicitObserver explicitObserver = new ExplicitObserver(explicitSubject);
        explicitSubject.register(explicitObserver);
        explicitSubject.setData("My Data 2");
    }

}
