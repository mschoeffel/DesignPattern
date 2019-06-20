package verhaltensmuster.vermittler;

public abstract class Teilnehmer {

    private Switch vermittler;
    private int rufnummer;
    private Teilnehmer aktuelleGegenstelle = null;

    public Teilnehmer(Switch vermittler, int rufnummer) {
        this.vermittler = vermittler;
        this.rufnummer = rufnummer;
    }

    public boolean istBelegt(){
        return aktuelleGegenstelle != null;
    }

    public Switch getVermittler() {
        return vermittler;
    }

    public int getRufnummer() {
        return rufnummer;
    }

    public void verbinde(Teilnehmer gegenstelle){
        System.out.println(rufnummer + " Verbinde mit Gegenstelle: " + gegenstelle.getRufnummer());
        aktuelleGegenstelle = gegenstelle;
        gegenstelle.verbindungAnnehmen(this);
    }

    public void verbindungAnnehmen(Teilnehmer gegenstelle){
        aktuelleGegenstelle = gegenstelle;
    }

    public void auflegen(){
        System.out.println(rufnummer + " Lege auf");
        aktuelleGegenstelle = null;
    }

    public void anwahl(Teilnehmer gegenstelle){
        try{
            vermittler.verbinde(this, gegenstelle);
        } catch(SwitchException e){
            System.out.println(rufnummer + " Verbindungsfehler: " + e.getMessage());
        }
    }

    public void aktuelleVerbindungTrennen(){
        if(aktuelleGegenstelle != null){
            try{
                vermittler.trenne(this, aktuelleGegenstelle);
            } catch(SwitchException e){
                System.out.println(rufnummer + " Verbindungsabbaufehler: " + e.getMessage());
            }
        }
    }
}
