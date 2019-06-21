package verhaltensmuster.strategie;

public class Festbewertung extends Bewertung{

    @Override
    public float bewerte(Lager lager) {
        return super.berechneAktuellenBestand(lager) * lager.getAktuellerPreis();
    }
}
