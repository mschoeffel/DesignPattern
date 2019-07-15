package behaviour_patterns.observer;


public class ExplicitSubject extends Subject {

    private String data;

    public ExplicitSubject() {
        super();
    }

    public void setData(String date) {
        this.data = date;
        System.out.println("Data was changed");
        notice();
    }

    public String getData() {
        return data;
    }
}
