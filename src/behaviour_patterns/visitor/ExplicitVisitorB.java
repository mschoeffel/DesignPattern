package behaviour_patterns.visitor;

public class ExplicitVisitorB extends Visitor {

    private String resultB;

    public ExplicitVisitorB() {
        resultB = "";
    }

    public String getResultB() {
        return resultB;
    }

    @Override
    public void visitElementA(ExplicitElementA explicitElementA) {
        resultB += "\nVisitor B Result to Element A: " + explicitElementA.getData();
    }

    @Override
    public void visitElementB(ExplicitElementB explicitElementB) {
        resultB += "\nVisitor B Result to Element B: " + explicitElementB.getData();
    }
}
