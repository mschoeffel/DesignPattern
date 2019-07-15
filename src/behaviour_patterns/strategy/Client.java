package behaviour_patterns.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();


        context.setStrategy(new ExplicitStrategyA());
        System.out.println("Strategy call A: " + context.operation());

        context.setStrategy(new ExplicitStrategyB());
        System.out.println("Strategy call B: " + context.operation());
    }

}
