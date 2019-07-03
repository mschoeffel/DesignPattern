package behaviour_patterns.mediator;

public class Client {

    public static void main(String[] args) {
        Switch telephoneSystem = new TelephoneSystem();
        Telephone telephone100 = new Telephone(telephoneSystem, 100);
        Telephone telephone101 = new Telephone(telephoneSystem, 101);
        Telephone telephone102 = new Telephone(telephoneSystem, 102);

        telephone100.call(telephone101);

        telephone102.call(telephone101);

        telephone100.diconnectCurrentConnection();

        telephone102.call(telephone101);
    }

}
