package behaviour_patterns.interceptor;

public class Client {

    public static void main(String[] args) {
        OrderFramework framework = new OrderFramework();
        Interceptor interceptor = new DecryptionInterceptor();
        framework.getDispatcher().register(interceptor);
        framework.orderEvent("A decrypted order", true);
    }

}
