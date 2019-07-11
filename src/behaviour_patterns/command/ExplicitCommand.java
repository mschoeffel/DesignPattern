package behaviour_patterns.command;

public class ExplicitCommand extends Command {

    private String state;

    @Override
    public void operation() {
        Receiver receiver = new Receiver();
        receiver.action();
    }
}
