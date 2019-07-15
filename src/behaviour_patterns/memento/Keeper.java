package behaviour_patterns.memento;

import java.util.HashMap;
import java.util.Map;

public class Keeper {
    private Map<String, Memento> states;

    public Keeper(){
        states = new HashMap<>();
    }

    public Memento getState(String key){
        if(states.containsKey(key))
            return states.get(key);
        return null;
    }

    public void saveState(Memento state, String key){
        states.put(key, state);
    }
}
