package verhaltensmuster.zustand;

public class Eingegangen implements ZustandInterface {

    public Eingegangen(){}

    @Override
    public void benachrichtige() {
        System.out.println("Bewerbung ist eingegangen");
    }

    @Override
    public void verarbeite() {
        System.out.println("Eingang der Bewerbung wurde verarbeitet");
    }
}
