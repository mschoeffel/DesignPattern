package structural_patterns.adapter;

import java.util.ArrayList;

public abstract class WorkflowObjekt {

    private ArrayList<WorkflowObjekt> workflowObjekte;
    private String objektId;

    public WorkflowObjekt(String objektId){
        workflowObjekte = new ArrayList<>();
        this.objektId = objektId;
    }

    public void addWorkflowObjekt(WorkflowObjekt workflowObjekt){
        workflowObjekte.add(workflowObjekt);
    }

    protected WorkflowErgebnis getErgebnisObjekt()
    {
        WorkflowErgebnis ergebnis = new WorkflowErgebnis(objektId);
        return ergebnis;
    }

    public WorkflowErgebnis ausfuehren(){
        WorkflowErgebnis ergebnis = new WorkflowErgebnis(objektId);
        for(WorkflowObjekt workflowObjekt : workflowObjekte){
            try{
                WorkflowErgebnis ergebnisKindObjekt = workflowObjekt.ausfuehren();
                if(!ergebnisKindObjekt.isWarEfolgreich()){
                    return ergebnisKindObjekt;
                }
            } catch(Exception e){
                ergebnis.setWarEfolgreich(false);
                ergebnis.setFehlermeldung(e.getMessage());
                return ergebnis;
            }
        }
        ergebnis.setWarEfolgreich(true);
        return ergebnis;
    }
}
