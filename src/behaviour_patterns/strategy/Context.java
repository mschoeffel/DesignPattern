package behaviour_patterns.strategy;

public class Context {

    private Strategy strategy;

    public String operation() {
        if (strategy != null) {
            return strategy.operation(this);
        } else {
            return "No strategy selected";
        }
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
