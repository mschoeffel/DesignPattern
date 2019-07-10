package structural_patterns.flyweight;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        ExplicitFlyweightA a = (ExplicitFlyweightA) factory.getFlyweight("A");
        a.operation();
        ExplicitFlyweightB b = (ExplicitFlyweightB) factory.getFlyweight("B");
        b.operation();
        ExplicitFlyweightA a2 = (ExplicitFlyweightA) factory.getFlyweight("A");
        a2.operation();
    }
}
