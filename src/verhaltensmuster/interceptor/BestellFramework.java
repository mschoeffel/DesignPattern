package verhaltensmuster.interceptor;

import java.time.LocalDate;

public class BestellFramework {

    Dispatcher dispatcher;

    public BestellFramework() {
        dispatcher = new Dispatcher();
    }

    public void bestellEvent(String bestelldaten, boolean isVerschluesselt){
        BestellContext bestellContext = new BestellContext(bestelldaten, LocalDate.now(), isVerschluesselt);
        dispatcher.dispatch(bestellContext);
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }
}
