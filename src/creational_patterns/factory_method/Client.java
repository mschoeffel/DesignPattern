package creational_patterns.factory_method;

public class Client {

    public static void main(String[] args) {
        Factory factory = new ExplicitFactory();
        ExplicitProduct product = (ExplicitProduct) factory.FactoryMethod();

    }
}
