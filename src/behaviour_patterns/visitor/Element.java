package behaviour_patterns.visitor;

public abstract class Element {

    private int count;
    private float price;
    private String title;

    public Element(int count, float price, String title) {
        this.count = count;
        this.price = price;
        this.title = title;
    }

    public abstract void take(Visitor visitor);

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
