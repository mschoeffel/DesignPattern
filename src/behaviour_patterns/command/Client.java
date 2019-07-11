package behaviour_patterns.command;

public class Client {

    public static void main(String[] args) {
        Command command1 = new ExplicitCommand();
        Command command2 = new ExplicitCommand();
        Command command3 = new ExplicitCommand();

        Caller caller = new Caller();

        caller.addCommand(command1);
        caller.addCommand(command2);
        caller.addCommand(command3);

        caller.executeCommands();
    }
}
