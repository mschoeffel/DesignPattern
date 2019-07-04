package creational_patterns.singleton;

public class Client {

    public static void main(String[] args){
        String value = Configuration.getInstance().getValue("TEST");
    }
}
