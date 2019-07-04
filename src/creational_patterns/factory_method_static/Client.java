package creational_patterns.factory_method_static;

public class Client {

    public static void main(String[] args) {
        MyObject objectWithoutParameter = MyObject.getFactory().create();
        MyObject objectWithParameter = MyObject.getFactory().create("aParameter");

        MyFactory factory = new MyFactory("aDefaultAttribute");
        MyObject objectWithDefualtAttribute = factory.create();
    }
}
