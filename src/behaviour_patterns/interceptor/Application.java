package behaviour_patterns.interceptor;

public class Application {

    public void initApllication() {
        Framework framework = new Framework();
        Interceptor interceptor = new ExplicitInterceptor();
        framework.getDispatcher().register(interceptor);
        framework.event();
    }
}
