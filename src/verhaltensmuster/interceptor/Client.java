package verhaltensmuster.interceptor;

public class Client {

    public static void main(String[] args){
        BestellFramework framework = new BestellFramework();
        Interceptor interceptor = new EntschluesselungInterceptor();
        framework.getDispatcher().registriere(interceptor);
        framework.bestellEvent("Eine bestellung verschluesselt", true);
    }

}
