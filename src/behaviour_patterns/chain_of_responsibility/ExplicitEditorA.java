package behaviour_patterns.chain_of_responsibility;

public class ExplicitEditorA extends Editor {

    @Override
    public void operation() {
        if(nextEditor != null) {
            nextEditor.operation();
        } else{
            System.out.println("ExplicitEditorA did something");
        }
    }
}
