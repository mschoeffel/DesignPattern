package behaviour_patterns.interpreter;

public class TerminalExpression extends Expression {

    private String literal;

    public TerminalExpression(String literal){
        this.literal = literal;
    }

    @Override
    public String interpret(Context context) {
        if(context.getInfo().contains(literal))
            return literal;
        return "ERROR";
    }
}
