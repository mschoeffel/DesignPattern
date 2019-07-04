package creational_patterns.factory_method_static;

public class MyFactory {

    private String defaultAttribute;

    public MyObject create(String defaultAttribute) {
        return new MyObject(defaultAttribute);
    }

    public MyFactory(String defaultAttribute) {
        this.defaultAttribute = defaultAttribute;
    }

    public MyFactory() {
    }

    public MyObject create() {
        return new MyObject(defaultAttribute);
    }
}
