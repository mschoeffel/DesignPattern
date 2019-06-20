package verhaltensmuster.interpreter;

public class Parser {

    public TestdatenAusdruck parse(String ausdruck){
        if(ausdruck.isEmpty()){
            throw new RuntimeException("Leerer Ausdruck");
        }
        ZusammengesetzterAusdruck zusammengesetzterAusdruck = new ZusammengesetzterAusdruck();
        StringBuilder literal = new StringBuilder();

        for(int i=0; i<ausdruck.length(); i++){
            char c = ausdruck.charAt(i);
            switch(c){
                case '#':
                    literalAusdruckHinzufuegen(literal, zusammengesetzterAusdruck);
                    zusammengesetzterAusdruck.ausdruckHinzufuegen(new ZufallszahlAusdruck());
                    break;
                case '<':
                    literalAusdruckHinzufuegen(literal, zusammengesetzterAusdruck);
                    String variable = delimitedString(ausdruck.substring(i), '<', '>');
                    zusammengesetzterAusdruck.ausdruckHinzufuegen(new VariableAusdruck(variable));
                    i = i + variable.length()+1;
                    continue;
                case '[':
                    literalAusdruckHinzufuegen(literal, zusammengesetzterAusdruck);
                    String wdhString = delimitedString(ausdruck.substring(i), '[', ']');
                    int kommaPosition = wdhString.indexOf(',');
                    if(kommaPosition == -1){
                        throw new RuntimeException("Kein Komma vorhanden, das die Wiederholung trennt");
                    }
                    int anzWiederholungen = Integer.parseInt(wdhString.substring(0, kommaPosition));
                    String ausdruchWiederholungen = wdhString.substring(kommaPosition+1);
                    zusammengesetzterAusdruck.ausdruckHinzufuegen(new WiederholungAusdruck(parse(ausdruchWiederholungen), anzWiederholungen));
                    i = i + wdhString.length() + 1;
                    break;
                default:
                    literal.append(c);
                    break;
            }
        }
        literalAusdruckHinzufuegen(literal, zusammengesetzterAusdruck);
        if(zusammengesetzterAusdruck.getAusdruecke().size() == 0){
            return null;
        } else if(zusammengesetzterAusdruck.getAusdruecke().size() == 1){
            return zusammengesetzterAusdruck.getAusdruecke().get(0);
        } else{
            return zusammengesetzterAusdruck;
        }
    }

    private String delimitedString(String ausdruck, char start, char end){
        int delimiterCounter = 0;
        for(int i = 1; i < ausdruck.length(); i++){
            if(ausdruck.charAt(i) == start){
                delimiterCounter += 1;
                continue;
            }

            if(ausdruck.charAt(i) == end){
                if (delimiterCounter == 0){
                    return ausdruck.substring(1,i);
                } else{
                    delimiterCounter -= 1;
                }
            }
        }
        throw new RuntimeException("Kein schließendes Element");
    }

    private void literalAusdruckHinzufuegen(StringBuilder literal, ZusammengesetzterAusdruck zusammengesetzterAusdruck){
        if(literal.length() > 0){
            zusammengesetzterAusdruck.ausdruckHinzufuegen(new LiteralAusdruck(literal.toString()));
            literal.setLength(0);
        }
    }

}
