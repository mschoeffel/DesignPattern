package erzeugungsmuster.factorymethod;

public class GutschriftFakturierer extends Fakturierer {

    @Override
    public Dokument erzeugeDokument() {
        return new Gutschrift();
    }
}
