package creational_patterns.factorymethod;

public class Client {

    public static void main(String[] args){
        Fakturierer fakturierer = new GutschriftFakturierer();
        Dokument dokument = fakturierer.erzeugeDokument();
        dokument.setBelegnummer(123456);
        ((Gutschrift)dokument).setGutschriftBetrag(10.00f);
        fakturierer.fakturiereDokument();
    }
}
