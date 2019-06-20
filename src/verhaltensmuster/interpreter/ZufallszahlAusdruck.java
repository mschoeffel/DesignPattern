package verhaltensmuster.interpreter;

public class ZufallszahlAusdruck extends TestdatenAusdruck {

    @Override
    public String Interpretiere(Kontext kontext) {
        int zufallszahl = (int)(Math.random()*100);
        return Integer.toString(zufallszahl);
    }
}
