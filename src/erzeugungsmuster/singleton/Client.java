package erzeugungsmuster.singleton;

public class Client {

    public static void main(String[] args){
        String wert = Konfiguration.getInstance().getWert("TEST");
    }
}
