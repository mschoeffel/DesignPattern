package structural_patterns.bridge;

public abstract class Abstraction {
    private Implementer instance;

    public Abstraction(Implementer implementer) {
        instance = implementer;
    }

    public Implementer getInstance() {
        return instance;
    }

    public abstract void operation();
}
