package behaviour_patterns.interpreter;

public class Client {

    public static void main(String[] args) {
        Context context = new Context("MY_TEST");
        Expression expressionTerminal1 = new TerminalExpression("MY");
        Expression expressionTerminal2 = new TerminalExpression("TEST");
        Expression expressionNonTerminal = new NonTerminalExpression(expressionTerminal1, expressionTerminal2);

        System.out.println(expressionNonTerminal.interpret(context));

    }

}
