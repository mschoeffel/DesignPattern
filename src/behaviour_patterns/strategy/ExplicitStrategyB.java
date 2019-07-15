package behaviour_patterns.strategy;

public class ExplicitStrategyB extends Strategy {

    @Override
    public String operation(Context context) {
        return "ExplicitStrategy B was called with context: " + context;
    }
}
