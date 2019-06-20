package verhaltensmuster.vermittler;

public class Client {

    public static void main(String[] args){
        Switch telefonanlage = new Telefonanlage();
        Telefon telefon100 = new Telefon(telefonanlage, 100);
        Telefon telefon101 = new Telefon(telefonanlage, 101);
        Telefon telefon102 = new Telefon(telefonanlage, 102);

        telefon100.anwahl(telefon101);

        telefon102.anwahl(telefon101);

        telefon100.aktuelleVerbindungTrennen();

        telefon102.anwahl(telefon101);
    }

}
