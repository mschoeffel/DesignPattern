package strukturmuster.fassade;

public class FassadeSendungsVerfolgung {

    public static FassadeEnum verfolge(String sendungsNummer){
        int length = sendungsNummer.length();

        switch(length){
            case 6:
                //Snail Mail
                SnailMailEnum snailMailStatus = SnailMailSendungsverfolgung.verfolge(Integer.parseInt(sendungsNummer));
                return snailMailStatus2FassadeStatus(snailMailStatus);
            case 9:
                //Liefer Fix
                try {
                    LieferFixEnum lieferFixStatus = new LieferFixSendungsverfolgung().pruefeSendeStatus(sendungsNummer);
                    return lieferFixStatus2FassadeStatus(lieferFixStatus);
                } catch(RuntimeException e){
                    return FassadeEnum.Undefiniert;
                }
            default:
                return FassadeEnum.Undefiniert;
        }
    }

    private static FassadeEnum snailMailStatus2FassadeStatus(SnailMailEnum snailMailStatus){
        //Umsetzung hier
        return FassadeEnum.Erfasst;
    }

    private static FassadeEnum lieferFixStatus2FassadeStatus(LieferFixEnum lieferFixStatus){
        //Umsetzung hier
        return FassadeEnum.Erhalten;
    }
}
