package behaviour_patterns.chain_of_responsibility;

public class Client {

    public static void main(String[] args) {
        Editor e1 = new ExplicitEditorA();
        Editor e2 = new ExplicitEditorB();
        Editor e3 = new ExplicitEditorA();
        Editor e4 = new ExplicitEditorA();
        Editor e5 = new ExplicitEditorB();

        e1.setNextEditor(e2);
        e2.setNextEditor(e3);
        e3.setNextEditor(e4);
        e4.setNextEditor(e5);

        e1.operation();

    }
}
