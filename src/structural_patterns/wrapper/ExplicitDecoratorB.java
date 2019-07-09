package structural_patterns.wrapper;

public class ExplicitDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("Explicit Decorator B");
    }
}
