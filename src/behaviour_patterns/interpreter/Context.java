package behaviour_patterns.interpreter;

import java.util.HashMap;

public class Context {

    private HashMap<String, String> variables;

    public Context() {
        variables = new HashMap<>();
    }

    public HashMap<String, String> getVariables() {
        return variables;
    }

    public void setVariables(HashMap<String, String> variables) {
        this.variables = variables;
    }
}
