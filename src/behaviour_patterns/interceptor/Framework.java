package behaviour_patterns.interceptor;

public class Framework {

    private Dispatcher dispatcher;

    public Framework(){
        dispatcher = new Dispatcher();
    }

    public void event(){
        Context context = new Context();
        context.setState("Event triggered");
        dispatcher.dispatch(context);
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }
}
