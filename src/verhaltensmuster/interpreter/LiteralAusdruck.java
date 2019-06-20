package verhaltensmuster.interpreter;

public class LiteralAusdruck extends TestdatenAusdruck {

    private String literal;

    public LiteralAusdruck(String literal) {
        this.literal = literal;
    }

    @Override
    public String Interpretiere(Kontext kontext) {
        return literal;
    }
}
