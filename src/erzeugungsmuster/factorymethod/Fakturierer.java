package erzeugungsmuster.factorymethod;

public abstract class Fakturierer {
    public abstract Dokument erzeugeDokument();

    public void fakturiereDokument(){
        Dokument dokument = erzeugeDokument();
        if(!dokument.isValid()){
            throw new IllegalArgumentException(
                    "Das zu verabeitende Dokument ist nicht gültig"
            );
        }
        //Arbeite mit dem Dokument
    }
}
