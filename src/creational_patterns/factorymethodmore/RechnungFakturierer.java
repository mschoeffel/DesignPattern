package creational_patterns.factorymethodmore;

import creational_patterns.factorymethod.Dokument;
import creational_patterns.factorymethod.Fakturierer;
import creational_patterns.factorymethod.Rechnung;

public class RechnungFakturierer extends Fakturierer {
    @Override
    public Dokument erzeugeDokument() {
        return new Rechnung();
    }

    public Rechnung erzeugeRechnung(Rechnungstyp rechnungstyp){
        switch(rechnungstyp){
            case NACHNAHMERECHNUNG:
                return new Nachnahmerechnung();
            case TEILZAHLUNGSRECHNUNG:
                return new Teilzahlungsrechnung();
            case VORAUSRECHNUNG:
                return new Vorausrechnung();
            default:
                return new Rechnung();
        }
    }
}
