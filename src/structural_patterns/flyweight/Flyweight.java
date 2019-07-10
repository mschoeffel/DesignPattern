package structural_patterns.flyweight;

public abstract class Flyweight {
    private String state;

    public Flyweight(String state){
        this.state = state;
    }

    public abstract void operation();
}
