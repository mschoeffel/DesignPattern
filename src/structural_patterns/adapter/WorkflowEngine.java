package structural_patterns.adapter;

import java.util.ArrayList;

public class WorkflowEngine {

    ArrayList<WorkflowObject> workflowObjects;

    public WorkflowEngine() {
        workflowObjects = new ArrayList<>();
    }

    public void addWorkflowObject(WorkflowObject workflowObject) {
        workflowObjects.add(workflowObject);
    }

    public WorkflowResult runAllWorkflowObjects() {
        for (WorkflowObject workflowObject : workflowObjects) {
            WorkflowResult result = workflowObject.run();
            if (!result.isWasSuccesfull())
                return result;
        }
        WorkflowResult finalResult = new WorkflowResult("engine");
        finalResult.setWasSuccesfull(true);
        return finalResult;
    }
}
