package creational_patterns.singleton;

import java.util.HashMap;

public final class Konfiguration {

    private HashMap<String, String> keyValuePair;
    private static Konfiguration instanz = new Konfiguration();

    private Konfiguration(){
        keyValuePair = new HashMap<>();
        //Lade Konfiguration
    }

    //synchronized ist optional (Dient der Thread Sicherheit)
    public static synchronized Konfiguration getInstance(){
        return instanz;
    }

    public HashMap<String, String> getKeyValuePair() {
        return keyValuePair;
    }

     public String getWert(String key){
        if(keyValuePair.containsKey(key)){
            return keyValuePair.get(key);
        } else{
            return null;
        }
     }

     public void setWert(String key, String wert){
        if(keyValuePair.containsKey(key)){
            keyValuePair.replace(key, wert);
        } else{
            keyValuePair.put(key, wert);
        }
        schreibeKonfiguration();
     }

     private void schreibeKonfiguration(){
        //Konfiguration zurückschreiben
     }
}
