package behaviour_patterns.strategy;

public class Durchschnittsbewertung extends Bewertung {

    @Override
    public float bewerte(Lager lager) {
        float aktuellerBestand = super.berechneAktuellenBestand(lager);
        float wert = 0;
        int gesamtmenge = 0;

        for(Bewegung bewegung : lager.getLagerbestand()){
            if(bewegung.Menge > 0){
                wert += bewegung.Menge * bewegung.Preis;
                gesamtmenge += bewegung.Menge;
            }
        }

        return (lager.getLagerbestand().size() * (wert/gesamtmenge));
    }
}
