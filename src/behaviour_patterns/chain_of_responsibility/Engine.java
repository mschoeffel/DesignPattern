package behaviour_patterns.chain_of_responsibility;

import java.util.List;

public abstract class Engine implements Command {
    private Command nextCommand;

    abstract protected List<String> getSupportedCommands();

    abstract protected void executeCommand(String command);

    public void processCommand(String commandText) {
        if (getSupportedCommands().contains(commandText)) {
            executeCommand(commandText);
        } else {
            if (nextCommand != null) {
                nextCommand.processCommand(commandText);
            }
        }
    }

    public void nextCommand(Command nextCommand) {
        this.nextCommand = nextCommand;
    }
}
