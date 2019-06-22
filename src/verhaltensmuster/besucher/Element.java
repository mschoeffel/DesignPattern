package verhaltensmuster.besucher;

public abstract class Element {

    private int anzahl;
    private float preis;
    private String titel;

    public Element(int anzahl, float preis, String titel) {
        this.anzahl = anzahl;
        this.preis = preis;
        this.titel = titel;
    }

    public abstract void nimmEntgegen(Besucher besucher);

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
