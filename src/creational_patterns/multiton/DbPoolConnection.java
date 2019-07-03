package creational_patterns.multiton;

import java.util.HashMap;

public class DbPoolConnection {

    private static HashMap<Integer, DbPoolConnection> instanzen = new HashMap<>();

    private DatabaseConnection dbConnection;
    private DbPoolConnection(){
        dbConnection = new DatabaseConnection("Ein Connection-String");
        dbConnection.Open();
    }

    public DatabaseConnection getDbConnection(){
        return dbConnection;
    }

    public static DbPoolConnection getInstanz(Integer key){
        synchronized (instanzen){
            DbPoolConnection instanz = instanzen.get(key);
            if(instanz == null){
                instanz = new DbPoolConnection();
                instanzen.put(key, instanz);
            }
            return instanz;
        }
    }
}
