package structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> components;

    public Composite(){
        components = new ArrayList<>();
    }

    @Override
    public void operation() {
        //Do some stuff like count trough with foreach element of the list call operation;
    }

    public void addComponent(Component component){
        if(!components.contains(component))
            components.add(component);
    }

    public void removeComponent(Component component){
        components.remove(component);
    }


}
