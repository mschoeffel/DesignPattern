package structural_patterns.adapter;

public class WorkflowAdapterOutputBig extends WorkflowObject {

    private WorkflowObjectOutputBig instance;

    public WorkflowAdapterOutputBig(String objektId, String outputText) {
        super(objektId);
        instance = new WorkflowObjectOutputBig(outputText);
    }

    @Override
    public WorkflowResult run() {
        WorkflowResult result = getResultObject();
        WorkflowResultB resultB = instance.start();
        if (resultB.getResult() > 0)
            result.setWasSuccesfull(true);
        else {
            result.setWasSuccesfull(false);
            result.setErrorMsg("n/a");
        }
        if (result.isWasSuccesfull())
            return super.run();
        else
            return result;
    }
}
