package verhaltensmuster.strategie;

public abstract class Bewertung {

    public abstract float bewerte(Lager lager);

    protected float berechneAktuellenBestand(Lager lager){
        float bestand = 0;
        for(Bewegung bewegung : lager.getLagerbestand()){
            bestand += bewegung.Menge;
        }
        return bestand;
    }

}
