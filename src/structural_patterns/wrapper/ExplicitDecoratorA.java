package structural_patterns.wrapper;

public class ExplicitDecoratorA extends Decorator{
    @Override
    public void operation() {
        super.operation();
        System.out.println("Explicit Decorator A");
    }
}
