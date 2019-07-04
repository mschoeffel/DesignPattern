package creational_patterns.factory_method;

public class ExplicitFactory extends Factory{

    @Override
    public ExplicitProduct FactoryMethod(){
        return new ExplicitProduct();
    }
}
