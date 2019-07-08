package structural_patterns.bridge;

public class ExplicitImplementerB extends Implementer {
    @Override
    public void implementerOperation() {
        //Do stuff
        System.out.println("B");
    }
}
