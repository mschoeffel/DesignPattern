package creational_patterns.factory_method_static;

public class MyObject {

    private static MyFactory factory = new MyFactory();
    private String attribute;

    public MyObject(String attribute) {
        factory = new MyFactory();
        this.attribute = attribute;
    }

    public static MyFactory getFactory() {
        return factory;
    }
}
