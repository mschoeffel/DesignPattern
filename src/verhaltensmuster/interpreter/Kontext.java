package verhaltensmuster.interpreter;

import java.util.HashMap;

public class Kontext {

    private HashMap<String, String> variablen;

    public Kontext(){
        variablen = new HashMap<>();
    }

    public HashMap<String, String> getVariablen() {
        return variablen;
    }

    public void setVariablen(HashMap<String, String> variablen) {
        this.variablen = variablen;
    }
}
