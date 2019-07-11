package behaviour_patterns.interceptor;

import java.util.LinkedList;
import java.util.List;

public class Dispatcher {

    private List<Interceptor> interceptors;

    public Dispatcher(){
        interceptors = new LinkedList<>();
    }

    public void register(Interceptor interceptor){
        if(!interceptors.contains(interceptor))
            interceptors.add(interceptor);
    }

    public void remove(Interceptor interceptor){
        interceptors.remove(interceptor);
    }

    public void dispatch(Context context){
        interceptors.forEach(interceptor -> interceptor.handleEvent(context));
    }
}
