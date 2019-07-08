package structural_patterns.bridge;

public class ExplicitImplementerA extends Implementer {
    @Override
    public void implementerOperation() {
        //Do stuff
        System.out.println("A");
    }
}
