package verhaltensmuster.interpreter;

public class VariableAusdruck extends TestdatenAusdruck {

    private String variable;

    public VariableAusdruck(String variable) {
        this.variable = variable;
    }

    @Override
    public String Interpretiere(Kontext kontext) {
        if(kontext.getVariablen().containsKey(variable)){
            return kontext.getVariablen().get(variable);
        } else{
            return "ERROR";
        }
    }
}
