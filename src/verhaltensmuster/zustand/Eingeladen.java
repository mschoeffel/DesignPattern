package verhaltensmuster.zustand;

public class Eingeladen implements ZustandInterface{

    public Eingeladen(){}

    @Override
    public void benachrichtige() {
        System.out.println("Bewerber/-in wird eingeladen");
    }

    @Override
    public void verarbeite() {
        System.out.println("Einladung verarbeitet");
    }
}
