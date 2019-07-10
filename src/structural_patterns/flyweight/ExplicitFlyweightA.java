package structural_patterns.flyweight;

public class ExplicitFlyweightA extends Flyweight {


    public ExplicitFlyweightA(String state) {
        super(state);
    }

    @Override
    public void operation() {
        System.out.println("FlyweightA" + this);
    }
}
