package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> instances;

    public FlyweightFactory(){
        instances = new HashMap<>();
    }

    public Flyweight getFlyweight(String state){
        Flyweight obj = null;
        if(instances.containsKey(state)){
            obj = instances.get(state);
        } else{
            if(state.equals("A")) {
                 obj = new ExplicitFlyweightA(state);
                instances.put("A", obj);
            } else if(state.equals("B")){
                obj = new ExplicitFlyweightB(state);
                instances.put("B", obj);
            }
        }
        return obj;
    }
}
