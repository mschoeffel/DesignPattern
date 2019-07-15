package behaviour_patterns.visitor;

public class ExplicitElementB extends Element {

    public ExplicitElementB(String data) {
        super(data);
        setData(data + " mod by elem B");
    }

    @Override
    public void take(Visitor visitor) {
        visitor.visitElementB(this);
    }
}
