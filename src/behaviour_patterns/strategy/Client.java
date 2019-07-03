package behaviour_patterns.strategy;

public class Client {

    public static void main(String[] args){
        Lager lager = new Lager();
        lager.addBewegung(new Bewegung(10, 2)); //20
        lager.addBewegung(new Bewegung(10, 3)); //30
        lager.addBewegung(new Bewegung(22, 2)); //44
        lager.addBewegung(new Bewegung(30, 5)); //150
        lager.addBewegung(new Bewegung(8, 10)); //80

        lager.setAktuelleBewertung(new Durchschnittsbewertung());
        System.out.println("Bewertung mit Durchschnitt: " + lager.bewerte());

        lager.setAktuelleBewertung(new Festbewertung());
        System.out.println("Bewertung mit Festwert: " + lager.bewerte());
    }

}
