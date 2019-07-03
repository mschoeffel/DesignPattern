package behaviour_patterns.interpreter;

public class Parser {

    public TestdataPrint parse(String expression) {
        if (expression.isEmpty()) {
            throw new RuntimeException("Empty Expression");
        }
        CompoundPrint compoundPrint = new CompoundPrint();
        StringBuilder literal = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch (c) {
                case '#':
                    addLiteralPrint(literal, compoundPrint);
                    compoundPrint.addPrint(new RandomNumberPrint());
                    break;
                case '<':
                    addLiteralPrint(literal, compoundPrint);
                    String variable = delimitedString(expression.substring(i), '<', '>');
                    compoundPrint.addPrint(new VariablePrint(variable));
                    i = i + variable.length() + 1;
                    continue;
                case '[':
                    addLiteralPrint(literal, compoundPrint);
                    String repeatStr = delimitedString(expression.substring(i), '[', ']');
                    int commaPosition = repeatStr.indexOf(',');
                    if (commaPosition == -1) {
                        throw new RuntimeException("No comma available, that separates the repeats");
                    }
                    int countRepeat = Integer.parseInt(repeatStr.substring(0, commaPosition));
                    String expressionRepeated = repeatStr.substring(commaPosition + 1);
                    compoundPrint.addPrint(new RepeatedPrint(parse(expressionRepeated), countRepeat));
                    i = i + repeatStr.length() + 1;
                    break;
                default:
                    literal.append(c);
                    break;
            }
        }
        addLiteralPrint(literal, compoundPrint);
        if (compoundPrint.getPrints().size() == 0) {
            return null;
        } else if (compoundPrint.getPrints().size() == 1) {
            return compoundPrint.getPrints().get(0);
        } else {
            return compoundPrint;
        }
    }

    private String delimitedString(String print, char start, char end) {
        int delimiterCounter = 0;
        for (int i = 1; i < print.length(); i++) {
            if (print.charAt(i) == start) {
                delimiterCounter += 1;
                continue;
            }

            if (print.charAt(i) == end) {
                if (delimiterCounter == 0) {
                    return print.substring(1, i);
                } else {
                    delimiterCounter -= 1;
                }
            }
        }
        throw new RuntimeException("No Closing Element");
    }

    private void addLiteralPrint(StringBuilder literal, CompoundPrint compoundPrint) {
        if (literal.length() > 0) {
            compoundPrint.addPrint(new LiteralExpression(literal.toString()));
            literal.setLength(0);
        }
    }

}
