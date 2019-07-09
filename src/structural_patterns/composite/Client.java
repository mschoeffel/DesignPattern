package structural_patterns.composite;

public class Client {

    public static void main(String[] args) {
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        ((Composite) composite1).addComponent(composite2);
        ((Composite) composite1).addComponent(new ExplicitObject());
        ((Composite) composite2).addComponent(new ExplicitObject());
        ((Composite) composite2).addComponent(new ExplicitObject());
    }
}
