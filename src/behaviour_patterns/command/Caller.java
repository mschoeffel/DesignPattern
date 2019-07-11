package behaviour_patterns.command;

import java.util.LinkedList;
import java.util.List;

public class Caller {
    List<Command> history;

    public Caller(){
        history = new LinkedList<>();
    }

    public void addCommand(Command command){
        if(!history.contains(command))
            history.add(command);
    }

    public void executeCommands(){
        history.forEach(Command::operation);
    }
}
