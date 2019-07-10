package structural_patterns.flyweight;

public class ExplicitFlyweightB extends Flyweight {

    public ExplicitFlyweightB(String state) {
        super(state);
    }

    @Override
    public void operation() {
        System.out.println("FlyweightB" + this);
    }
}
