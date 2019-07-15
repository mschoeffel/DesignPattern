package behaviour_patterns.observer;

public class ExplicitObserver implements Observer {

    private ExplicitSubject explicitSubject;
    public ExplicitObserver(ExplicitSubject explicitSubject) {
        this.explicitSubject = explicitSubject;
    }

    @Override
    public void refresh() {
        String actualData = explicitSubject.getData();
        System.out.println("ExplicitObserver was updated");
        //Refresh view
    }
}
