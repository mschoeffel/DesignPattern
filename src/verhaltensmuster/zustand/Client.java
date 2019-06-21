package verhaltensmuster.zustand;

public class Client {

    public static void main(String[] args){
        Bewerbung bewerbung = new Bewerbung();
        bewerbung.benachrichtige();
        bewerbung.verarbeite();

        bewerbung.benachrichtige();
        bewerbung.verarbeite();
    }

}
