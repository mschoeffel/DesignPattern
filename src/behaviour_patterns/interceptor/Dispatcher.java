package behaviour_patterns.interceptor;

import java.util.ArrayList;

public class Dispatcher {

    private ArrayList<Interceptor> interceptors;

    public Dispatcher() {
        interceptors = new ArrayList<>();
    }

    public void register(Interceptor interceptor) {
        if (!interceptors.contains(interceptor)) {
            interceptors.add(interceptor);
        }
    }

    public void remove(Interceptor interceptor) {
        if (interceptors.contains(interceptor)) {
            interceptors.remove(interceptor);
        }
    }

    public void dispatch(OrderContext orderContext) {
        interceptors.forEach(interceptor -> interceptor.handleEvent(orderContext));
    }
}
