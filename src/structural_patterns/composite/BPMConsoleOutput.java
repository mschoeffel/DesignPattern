package structural_patterns.composite;

public class BPMConsoleOutput extends BPMComponent {
    private String text;

    public BPMConsoleOutput(int id, String text) {
        super(id);
        this.text = text;
    }

    @Override
    public void draw() {
        //Draw control
    }

    @Override
    public void start() {
        System.out.println(text);
    }
}
