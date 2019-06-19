package verhaltensmuster.interceptor;

import java.util.ArrayList;

public class Dispatcher {

    private ArrayList<Interceptor> interceptors;

    public Dispatcher() {
        interceptors = new ArrayList<>();
    }

    public void registriere(Interceptor interceptor){
        if(!interceptors.contains(interceptor)){
            interceptors.add(interceptor);
        }
    }

    public void entferne(Interceptor interceptor){
        if(interceptors.contains(interceptor)){
            interceptors.remove(interceptor);
        }
    }

    public void dispatch(BestellContext bestellContext){
        interceptors.forEach(interceptor -> interceptor.handleEvent(bestellContext));
    }
}
