package erzeugungsmuster.prototype;

public class Client {

    public static void main(String[] args){
        Dienstplan dienstplan = new Dienstplan();

        Urlaub halberTagUrlaub = dienstplan.kloneUrlaubObjekt("halber_tag");
        System.out.println("");
    }
}
