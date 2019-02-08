package erzeugungsmuster.multiton;

public class Client {

    public static void main(String[] args){
        DatabaseConnection dbcon = DbPoolConnection.getInstanz(12).getDbConnection();
        //Abfrage auf Datenbank dbcon
    }
}
