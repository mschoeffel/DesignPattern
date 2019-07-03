package behaviour_patterns.interpreter;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.getVariables().put("ort", "München");

        String testdaten = "Ort:<ort> Telefonnummer: +4989[4,#]-[5,#]-[3,#]";

        Parser parser = new Parser();

        TestdataPrint ausdruck = parser.parse(testdaten);

        System.out.println(ausdruck.interprete(context));
    }

}
