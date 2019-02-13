package strukturmuster.fassade;

public class Client {

    public static void main(String[] args){
        FassadeEnum resultSnail = FassadeSendungsVerfolgung.verfolge("123456");

        FassadeEnum resultFix = FassadeSendungsVerfolgung.verfolge("123456789");
    }
}
