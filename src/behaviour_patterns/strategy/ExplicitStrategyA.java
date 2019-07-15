package behaviour_patterns.strategy;

public class ExplicitStrategyA extends Strategy {

    @Override
    public String operation(Context context) {
        return "ExplicitStrategy A was called with context: " + context;
    }
}
