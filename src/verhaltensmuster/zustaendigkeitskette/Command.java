package verhaltensmuster.zustaendigkeitskette;

public interface Command {
    public void processCommand(String text);
    public void nextCommand(Command next);
}
