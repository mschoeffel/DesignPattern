package behaviour_patterns.chain_of_responsibility;

public abstract class Editor {

    protected Editor nextEditor;

    public abstract void operation();

    public void setNextEditor(Editor editor){
        this.nextEditor = editor;
    }
}
