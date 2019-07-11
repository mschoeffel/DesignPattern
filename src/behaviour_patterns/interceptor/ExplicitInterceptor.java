package behaviour_patterns.interceptor;

public class ExplicitInterceptor extends Interceptor {

    @Override
    public String handleEvent(Context context) {
        System.out.println("ExplicitInterceptor handled Event: " + context.getState());
        return "doneA";
    }
}
