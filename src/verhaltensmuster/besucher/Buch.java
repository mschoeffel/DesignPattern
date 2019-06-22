package verhaltensmuster.besucher;

public class Buch extends Element {

    public Buch(int anzahl, float preis, String titel) {
        super(anzahl, preis, titel);
    }

    public String isbn;
    public String autor;
    public String verlag;

    @Override
    public void nimmEntgegen(Besucher besucher){
        besucher.besucheBuch(this);
    }
}
