package behaviour_patterns.chain_of_responsibility;

public class Client {

    public static void main(String[] args) {
        Command firstEngine = new BuildEngine();
        DebugEngine debugEngine = new DebugEngine();
        firstEngine.nextCommand(debugEngine);

        String commandText = "debug";
        firstEngine.processCommand(commandText);
    }
}
