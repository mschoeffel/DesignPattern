package behaviour_patterns.interpreter;

public class NonTerminalExpression extends Expression {

    private Expression expressionLeft;
    private Expression expressionRight;

    public NonTerminalExpression(Expression expressionLeft, Expression expressionRight){
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public String interpret(Context context) {
        return expressionLeft.interpret(context) + " : " + expressionRight.interpret(context);
    }
}
