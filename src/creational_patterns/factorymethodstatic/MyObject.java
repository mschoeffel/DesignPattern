package creational_patterns.factorymethodstatic;

public class MyObject {

    private static MyFactory factory = new MyFactory();
    private String eineEigenschaft;

    public MyObject(String eineEigenschaft){
        factory = new MyFactory();
        this.eineEigenschaft = eineEigenschaft;
    }

    public static MyFactory getFactory(){
        return factory;
    }
}
