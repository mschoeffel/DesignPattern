package behaviour_patterns.chain_of_responsibility;

import java.util.Arrays;
import java.util.List;

public class DebugEngine extends Engine {
    @Override
    protected List<String> getSupportedCommands() {
        return Arrays.asList("debug", "debugWindow");
    }

    @Override
    protected void executeCommand(String command) {
        System.out.println("Command executed: " + command);
    }
}
