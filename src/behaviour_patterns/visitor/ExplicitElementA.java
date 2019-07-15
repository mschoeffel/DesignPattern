package behaviour_patterns.visitor;

public class ExplicitElementA extends Element {


    public ExplicitElementA(String data) {
        super(data);
        setData(data + " mod by elem A");
    }

    @Override
    public void take(Visitor visitor) {
        visitor.visitElementA(this);
    }
}
