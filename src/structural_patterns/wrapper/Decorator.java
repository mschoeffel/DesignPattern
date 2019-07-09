package structural_patterns.wrapper;

import java.util.ArrayList;
import java.util.List;

public abstract class Decorator extends Component {

    private List<Component> components;

    public Decorator(){
        components = new ArrayList<>();
    }

    public void addComponent(Component component){
        if(!components.contains(component))
            components.add(component);
    }

    @Override
    public void operation() {
        components.forEach(Component::operation);
    }
}
