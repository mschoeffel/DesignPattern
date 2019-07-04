package structural_patterns.adapter;

public class WorkflowObjectOutput extends WorkflowObject {

    private String outputText;

    public WorkflowObjectOutput(String objektId, String outputText) {
        super(objektId);
        this.outputText = outputText;
    }

    @Override
    public WorkflowResult run() {
        WorkflowResult result = getResultObject();

        try {
            System.out.println(outputText);
            return super.run();
        } catch (Exception e) {
            result.setWasSuccesfull(false);
            result.setErrorMsg(e.getMessage());
            return result;
        }
    }
}
