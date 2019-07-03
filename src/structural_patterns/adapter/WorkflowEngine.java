package structural_patterns.adapter;

import java.util.ArrayList;

public class WorkflowEngine {

    ArrayList<WorkflowObjekt> workflowObjekte;

    public WorkflowEngine(){
        workflowObjekte = new ArrayList<>();
    }

    public void addWorkflowObjekt(WorkflowObjekt workflowObjekt){
        workflowObjekte.add(workflowObjekt);
    }

    public WorkflowErgebnis alleWorkflowsAusfuehren(){
        for(WorkflowObjekt workflowObjekt : workflowObjekte){
            WorkflowErgebnis ergebnis = workflowObjekt.ausfuehren();
            if(!ergebnis.isWarEfolgreich())
                return ergebnis;
        }
        WorkflowErgebnis gesamtErgebnis = new WorkflowErgebnis("engine");
        gesamtErgebnis.setWarEfolgreich(true);
        return gesamtErgebnis;
    }
}
