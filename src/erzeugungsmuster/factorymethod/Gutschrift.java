package erzeugungsmuster.factorymethod;

public class Gutschrift extends Dokument {
    private float gutschriftBetrag;

    public float getGutschriftBetrag() {
        return gutschriftBetrag;
    }

    public void setGutschriftBetrag(float gutschriftBetrag) {
        this.gutschriftBetrag = gutschriftBetrag;
    }

    @Override
    public boolean isValid() {
        return super.isValid() && (gutschriftBetrag > 0);
    }
}
