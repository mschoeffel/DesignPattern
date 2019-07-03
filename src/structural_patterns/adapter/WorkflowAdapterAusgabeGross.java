package structural_patterns.adapter;

public class WorkflowAdapterAusgabeGross extends WorkflowObjekt{

    private WorkflowObjektAusgabeGross instanz;

    public WorkflowAdapterAusgabeGross(String objektId, String ausgabeText){
        super(objektId);
        instanz = new WorkflowObjektAusgabeGross(ausgabeText);
    }

    @Override
    public WorkflowErgebnis ausfuehren(){
        WorkflowErgebnis ergebnis = getErgebnisObjekt();
        WorkflowErgebnisB ergebnisB = instanz.starten();
        if(ergebnisB.getErgebnis() > 0)
            ergebnis.setWarEfolgreich(true);
        else{
            ergebnis.setWarEfolgreich(false);
            ergebnis.setFehlermeldung("n/a");
        }
        if(ergebnis.isWarEfolgreich())
            return super.ausfuehren();
        else
            return ergebnis;
    }
}
