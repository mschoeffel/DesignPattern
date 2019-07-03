package structural_patterns.facade;

public class SnailMailSendungsverfolgung {

    private SnailMailSendungsverfolgung(){
        throw new AssertionError();
    }

    public static SnailMailEnum verfolge(int liefernummer){
        if(liefernummer < 100000)
            return SnailMailEnum.Undefiniert;
        //Abrufen
        return SnailMailEnum.Zugestellt;
    }
}
