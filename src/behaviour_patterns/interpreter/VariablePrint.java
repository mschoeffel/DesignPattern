package behaviour_patterns.interpreter;

public class VariablePrint extends TestdataPrint {

    private String variable;

    public VariablePrint(String variable) {
        this.variable = variable;
    }

    @Override
    public String interprete(Context context) {
        return context.getVariables().getOrDefault(variable, "ERROR");
    }
}
