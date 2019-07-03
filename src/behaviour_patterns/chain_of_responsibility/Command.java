package behaviour_patterns.chain_of_responsibility;

public interface Command {
    public void processCommand(String text);

    public void nextCommand(Command next);
}
