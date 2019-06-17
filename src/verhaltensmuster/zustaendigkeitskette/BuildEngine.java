package verhaltensmuster.zustaendigkeitskette;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildEngine extends Engine {
    @Override
    protected List<String> getSupportedCommands() {
        return Arrays.asList("build", "buildWindow");
    }

    @Override
    protected void executeCommand(String command) {
        System.out.println("Command executed: " + command);
    }
}
