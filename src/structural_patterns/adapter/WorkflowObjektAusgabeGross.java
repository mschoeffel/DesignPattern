package structural_patterns.adapter;

public class WorkflowObjektAusgabeGross {

    private String ausgabeText;

    public WorkflowObjektAusgabeGross(String ausgabeText){
        this.ausgabeText = ausgabeText;
    }

    public WorkflowErgebnisB starten(){
        System.out.println(ausgabeText.toUpperCase());
        WorkflowErgebnisB ergebnis = new WorkflowErgebnisB();
        ergebnis.setErgebnis(1);
        return ergebnis;
    }
}
