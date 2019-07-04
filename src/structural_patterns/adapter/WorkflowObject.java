package structural_patterns.adapter;

import java.util.ArrayList;

public abstract class WorkflowObject {

    private ArrayList<WorkflowObject> workflowObjects;
    private String objektId;

    public WorkflowObject(String objektId) {
        workflowObjects = new ArrayList<>();
        this.objektId = objektId;
    }

    public void addWorkflowObject(WorkflowObject workflowObject) {
        workflowObjects.add(workflowObject);
    }

    protected WorkflowResult getResultObject() {
        WorkflowResult result = new WorkflowResult(objektId);
        return result;
    }

    public WorkflowResult run() {
        WorkflowResult result = new WorkflowResult(objektId);
        for (WorkflowObject workflowObject : workflowObjects) {
            try {
                WorkflowResult resultChildObject = workflowObject.run();
                if (!resultChildObject.isWasSuccesfull()) {
                    return resultChildObject;
                }
            } catch (Exception e) {
                result.setWasSuccesfull(false);
                result.setErrorMsg(e.getMessage());
                return result;
            }
        }
        result.setWasSuccesfull(true);
        return result;
    }
}
