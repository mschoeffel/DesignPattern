package structural_patterns.composite;

public abstract class BPMComponent {
    private int id;
    protected BPMComponent parentObject = null;

    public abstract void draw();

    public abstract void start();

    public BPMComponent(int id) {
        this.id = id;
    }

    public BPMComponent getParentObject() {
        return parentObject;
    }

    public void setParentObject(BPMComponent parentObject) {
        this.parentObject = parentObject;
    }
}

