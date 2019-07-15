package behaviour_patterns.visitor;

public class ExplicitVisitorA extends Visitor {

    private String resultA;

    public ExplicitVisitorA() {
        resultA = "";
    }

    public String getResultA() {
        return resultA;
    }

    @Override
    public void visitElementA(ExplicitElementA explicitElementA) {
        resultA += "\nVisitor A Result to Element A: " + explicitElementA.getData();
    }

    @Override
    public void visitElementB(ExplicitElementB explicitElementB) {
        resultA += "\nVisitor A Result to Element B: " + explicitElementB.getData();
    }
}
