package structural_patterns.adapter;

public class Client {

    public static void main(String[] args) {
        WorkflowEngine engine = new WorkflowEngine();

        WorkflowObjectOutput littleOutput = new WorkflowObjectOutput("1", "little output");
        engine.addWorkflowObject(littleOutput);

        WorkflowAdapterOutputBig bigOutput = new WorkflowAdapterOutputBig("2", "big output");
        engine.addWorkflowObject(bigOutput);

        WorkflowObjectOutput childOutput = new WorkflowObjectOutput("3", "child output");
        bigOutput.addWorkflowObject(childOutput);

        WorkflowResult result = engine.runAllWorkflowObjects();
    }
}
