package creational_patterns.multiton;

import java.util.HashMap;

public class DbPoolConnection {

    private static HashMap<Integer, DbPoolConnection> instances = new HashMap<>();

    private DatabaseConnection dbConnection;
    private DbPoolConnection(){
        dbConnection = new DatabaseConnection("A Connection String");
        dbConnection.open();
    }

    public DatabaseConnection getDbConnection(){
        return dbConnection;
    }

    public static DbPoolConnection getInstance(Integer key){
        synchronized (instances){
            DbPoolConnection instance = instances.get(key);
            if(instance == null){
                instance = new DbPoolConnection();
                instances.put(key, instance);
            }
            return instance;
        }
    }
}
