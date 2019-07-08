package structural_patterns.bridge;

public class Client {

    public static void main(String[] args) {
        Implementer implementerA = new ExplicitImplementerA();

        Abstraction abstraction = new ExplicitAbstraction(implementerA);
        abstraction.operation();
    }
}
