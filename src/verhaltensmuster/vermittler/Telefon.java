package verhaltensmuster.vermittler;

public class Telefon extends Teilnehmer {

    public Telefon(Switch vermittler, int rufnummer) {
        super(vermittler, rufnummer);
    }

    public void anwahl(Teilnehmer[] gegenstellen) {
        try{
            getVermittler().konferenz(this, gegenstellen);
        } catch(SwitchException e){
            System.out.println("Verbindungsfehler: " + e.getMessage());
        }
    }
}
