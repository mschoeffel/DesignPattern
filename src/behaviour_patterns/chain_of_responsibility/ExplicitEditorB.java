package behaviour_patterns.chain_of_responsibility;

public class ExplicitEditorB extends Editor {

    @Override
    public void operation() {
        if(nextEditor != null) {
            nextEditor.operation();
        } else{
            System.out.println("ExplicitEditorB did something");
        }
    }
}
