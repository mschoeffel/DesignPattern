package creational_patterns.singleton;

import java.util.HashMap;

public final class Configuration {

    private HashMap<String, String> keyValuePair;
    private static Configuration instance = new Configuration();

    private Configuration(){
        keyValuePair = new HashMap<>();
        //Load Configuration
    }

    //synchronized is optional (for thread safety)
    public static synchronized Configuration getInstance(){
        return instance;
    }

    public HashMap<String, String> getKeyValuePair() {
        return keyValuePair;
    }

     public String getValue(String value){
        if(keyValuePair.containsKey(value)){
            return keyValuePair.get(value);
        } else{
            return null;
        }
     }

     public void setValue(String key, String value){
        if(keyValuePair.containsKey(key)){
            keyValuePair.replace(key, value);
        } else{
            keyValuePair.put(key, value);
        }
        writeConfig();
     }

     private void writeConfig(){
        //Write configuration
     }
}
