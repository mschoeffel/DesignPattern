package erzeugungsmuster.factorymethodmore;

import erzeugungsmuster.factorymethod.Fakturierer;
import erzeugungsmuster.factorymethod.Rechnung;

public class Client {

    public static void main(String[] args){
        Fakturierer fakturierer = new RechnungFakturierer();
        Rechnung rechnung = ((RechnungFakturierer) fakturierer).erzeugeRechnung(Rechnungstyp.NACHNAHMERECHNUNG);
        rechnung.setBelegnummer(123456);
        fakturierer.fakturiereDokument();
    }
}
