package erzeugungsmuster.factorymethodstatic;

public class MyFactory {

    private String defaultEigenschaft;

    public MyObject create(String eineEigenschaft){
        return new MyObject(eineEigenschaft);
    }

    public MyFactory(String defaultEigenschaft){
        this.defaultEigenschaft = defaultEigenschaft;
    }

    public MyFactory(){
    }

    public MyObject create(){
        return new MyObject(defaultEigenschaft);
    }
}
