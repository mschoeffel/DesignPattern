package structural_patterns.adapter;

public class WorkflowErgebnis {

    private String objektId;
    private boolean warEfolgreich;
    private String fehlermeldung;

    public WorkflowErgebnis(String objektId){
        this.objektId = objektId;
    }

    public boolean isWarEfolgreich() {
        return warEfolgreich;
    }

    public void setWarEfolgreich(boolean warEfolgreich) {
        this.warEfolgreich = warEfolgreich;
    }

    public String getFehlermeldung() {
        return fehlermeldung;
    }

    public void setFehlermeldung(String fehlermeldung) {
        this.fehlermeldung = fehlermeldung;
    }

    public String getObjektId() {
        return objektId;
    }
}
