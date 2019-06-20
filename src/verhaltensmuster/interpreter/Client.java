package verhaltensmuster.interpreter;

public class Client {

    public static void main(String[] args){
        Kontext kontext = new Kontext();
        kontext.getVariablen().put("ort", "München");

        String testdaten = "Ort:<ort> Telefonnummer: +4989[4,#]-[5,#]-[3,#]";

        Parser parser = new Parser();

        TestdatenAusdruck ausdruck = parser.parse(testdaten);

        System.out.println(ausdruck.Interpretiere(kontext));
    }

}
