package structural_patterns.composite;

import java.util.ArrayList;

public class BPMSequence extends BPMComponent {
    ArrayList<BPMComponent> components;


    public BPMSequence(int id) {
        super(id);
        components = new ArrayList<>();
    }

    @Override
    public void draw() {
        //draw
    }

    public void add(BPMComponent component) {
        if (component.parentObject != null)
            throw new AssertionError("The child object is already child of another object");

        if (components.contains(component))
            throw new AssertionError("The child object already exists");

        BPMComponent componentToValidate = component.getParentObject();
        while (componentToValidate != null) {
            if (componentToValidate == component)
                throw new AssertionError("Loop detected");
            componentToValidate = componentToValidate.getParentObject();
        }

        components.add(component);
        component.parentObject = this;
    }

    public void remove(BPMComponent component) {
        if (components.contains(component))
            components.remove(component);
    }

    public BPMComponent getChildObject(int index) {
        if (index >= 0 || index < components.size())
            return components.get(index);
        else
            return null;
    }

    @Override
    public void start() {
        for (BPMComponent component : components) {
            component.start();
        }
    }
}
