package verhaltensmuster.interpreter;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ZusammengesetzterAusdruck extends TestdatenAusdruck {

    private ArrayList<TestdatenAusdruck> ausdruecke;

    public ZusammengesetzterAusdruck() {
        ausdruecke = new ArrayList<>();
    }

    public void ausdruckHinzufuegen(TestdatenAusdruck ausdruck){
        ausdruecke.add(ausdruck);
    }

    public ArrayList<TestdatenAusdruck> getAusdruecke() {
        return ausdruecke;
    }

    @Override
    public String Interpretiere(Kontext kontext) {
        return ausdruecke.stream().map(testdatenAusdruck -> testdatenAusdruck.Interpretiere(kontext)).collect(Collectors.joining());
    }
}
