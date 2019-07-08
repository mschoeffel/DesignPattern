package structural_patterns.bridge;

public class ExplicitAbstraction extends Abstraction {

    public ExplicitAbstraction(Implementer implementer) {
        super(implementer);
    }

    @Override
    public void operation() {
        getInstance().implementerOperation();
    }
}
