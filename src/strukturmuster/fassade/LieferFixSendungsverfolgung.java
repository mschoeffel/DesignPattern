package strukturmuster.fassade;

public class LieferFixSendungsverfolgung {

    public LieferFixEnum pruefeSendeStatus(String sendungsnummer){
        if(sendungsnummer.length() != 9){
            throw new RuntimeException("Die Sendungsnummer ist falsch.");
        }
        //Auslesen aus DAtenbank
        return LieferFixEnum.InZustellung;
    }
}
