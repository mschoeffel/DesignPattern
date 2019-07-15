package behaviour_patterns.visitor;

public abstract class Element {

    private String data;

    public Element(String data) {
        this.data = data;
    }

    public abstract void take(Visitor visitor);

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
