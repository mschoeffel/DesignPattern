package structural_patterns.adapter;

public class Client {

    public static void main (String[] args){
        WorkflowEngine engine = new WorkflowEngine();

        WorkflowObjektAusgabe kleineAusgabe = new WorkflowObjektAusgabe("1", "kleine ausgabe");
        engine.addWorkflowObjekt(kleineAusgabe);

        WorkflowAdapterAusgabeGross grosseAusgabe = new WorkflowAdapterAusgabeGross("2", "grosse ausgabe");
        engine.addWorkflowObjekt(grosseAusgabe);

        WorkflowObjektAusgabe kindAusgabe = new WorkflowObjektAusgabe("3", "kind ausgabe");
        grosseAusgabe.addWorkflowObjekt(kindAusgabe);

        WorkflowErgebnis ergebnis = engine.alleWorkflowsAusfuehren();
    }
}
