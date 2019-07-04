package creational_patterns.multiton;

public class Client {

    public static void main(String[] args){
        DatabaseConnection dbcon = DbPoolConnection.getInstance(12).getDbConnection();
        //Query
    }
}
