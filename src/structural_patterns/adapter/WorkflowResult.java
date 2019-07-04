package structural_patterns.adapter;

public class WorkflowResult {

    private String objektId;
    private boolean wasSuccesfull;
    private String errorMsg;

    public WorkflowResult(String objektId) {
        this.objektId = objektId;
    }

    public boolean isWasSuccesfull() {
        return wasSuccesfull;
    }

    public void setWasSuccesfull(boolean wasSuccesfull) {
        this.wasSuccesfull = wasSuccesfull;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getObjektId() {
        return objektId;
    }
}
