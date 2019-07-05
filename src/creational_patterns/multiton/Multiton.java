package creational_patterns.multiton;

import java.util.HashMap;
import java.util.Map;

public final class Multiton {

    private static Map<Integer, Multiton> instances;

    private Multiton(){
        instances = new HashMap<>();
    }

    public static synchronized Multiton getMultiton(Integer key){
        if(!instances.containsKey(key)){
            instances.put(key, new Multiton());
        }
        return instances.get(key);
    }

}
