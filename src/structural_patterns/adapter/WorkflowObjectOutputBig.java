package structural_patterns.adapter;

public class WorkflowObjectOutputBig {

    private String outputText;

    public WorkflowObjectOutputBig(String outputText) {
        this.outputText = outputText;
    }

    public WorkflowResultB start() {
        System.out.println(outputText.toUpperCase());
        WorkflowResultB result = new WorkflowResultB();
        result.setResult(1);
        return result;
    }
}
