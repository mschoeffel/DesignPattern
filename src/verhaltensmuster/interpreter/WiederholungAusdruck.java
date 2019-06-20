package verhaltensmuster.interpreter;

public class WiederholungAusdruck extends TestdatenAusdruck {

    TestdatenAusdruck ausdruck;
    int anzahl;

    public WiederholungAusdruck(TestdatenAusdruck ausdruck, int anzahl) {
        this.ausdruck = ausdruck;
        this.anzahl = anzahl;
    }

    @Override
    public String Interpretiere(Kontext kontext) {

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < anzahl; i++){
            builder.append(ausdruck.Interpretiere(kontext));
        }
        return builder.toString();
    }
}
