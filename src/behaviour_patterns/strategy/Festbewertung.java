package behaviour_patterns.strategy;

public class Festbewertung extends Bewertung{

    @Override
    public float bewerte(Lager lager) {
        return super.berechneAktuellenBestand(lager) * lager.getAktuellerPreis();
    }
}
