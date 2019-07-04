package structural_patterns.composite;

public class BPMEMailNotification extends BPMComponent {
    private String target, sender, subject, text;

    public BPMEMailNotification(int id, String target, String sender, String subject, String text) {
        super(id);
        this.target = target;
        this.sender = sender;
        this.subject = subject;
        this.text = text;
    }

    @Override
    public void draw() {
        //draw
    }

    @Override
    public void start() {
        //send EMail
    }
}
