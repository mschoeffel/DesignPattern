package behaviour_patterns.interpreter;

public class LiteralExpression extends TestdataPrint {

    private String literal;

    public LiteralExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public String interprete(Context context) {
        return literal;
    }
}
