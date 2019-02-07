package erzeugungsmuster.factorymethodstatic;

public class Client {

    public static void main(String[] args){
        MyObject parameterlosesObjekt = MyObject.getFactory().create();
        MyObject objektMitParameter = MyObject.getFactory().create("einParameter");

        MyFactory factory = new MyFactory("eineDefaultEigenschaft");
        MyObject objektMitDefaultParameter = factory.create();
    }
}
