package other_patterns.callback;

public abstract class Task {

    public void executeWith(Callback c){
        execute();
        if(c != null){
            c.call();
        }
    }

    public abstract void execute();
    
    
}
