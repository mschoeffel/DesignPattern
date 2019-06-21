package verhaltensmuster.strategie;

import java.util.ArrayList;

public class Lager {

    private ArrayList<Bewegung> lagerbestand;
    private float aktuellerPreis;
    private Bewertung aktuelleBewertung;

    public Lager(){
        lagerbestand = new ArrayList<>();
    }

    public void addBewegung(Bewegung bewegung){
        if(!lagerbestand.contains(bewegung))
            lagerbestand.add(bewegung);
    }

    public float bewerte(){
        if(aktuelleBewertung != null){
            return aktuelleBewertung.bewerte(this);
        } else{
            throw new RuntimeException("Keine Strategie ausgewählt");
        }
    }

    public void setAktuellerPreis(float aktuellerPreis) {
        this.aktuellerPreis = aktuellerPreis;
    }

    public void setAktuelleBewertung(Bewertung aktuelleBewertung) {
        this.aktuelleBewertung = aktuelleBewertung;
    }

    public ArrayList<Bewegung> getLagerbestand() {
        return lagerbestand;
    }

    public float getAktuellerPreis() {
        return aktuellerPreis;
    }

    public Bewertung getAktuelleBewertung() {
        return aktuelleBewertung;
    }
}
