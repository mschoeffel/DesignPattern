package behaviour_patterns.interceptor;

import java.time.LocalDate;

public class OrderFramework {

    Dispatcher dispatcher;

    public OrderFramework() {
        dispatcher = new Dispatcher();
    }

    public void orderEvent(String orderData, boolean isEncrypted) {
        OrderContext orderContext = new OrderContext(orderData, LocalDate.now(), isEncrypted);
        dispatcher.dispatch(orderContext);
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }
}
