package verhaltensmuster.zustaendigkeitskette;

public class Client {

    public static void main(String[] args){
        Command firstEngine = new BuildEngine();
        DebugEngine debugEngine = new DebugEngine();
        firstEngine.nextCommand(debugEngine);

        String commandText = "debug";
        firstEngine.processCommand(commandText);
    }
}
