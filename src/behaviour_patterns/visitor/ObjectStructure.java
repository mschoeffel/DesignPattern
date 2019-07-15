package behaviour_patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> objects;

    public ObjectStructure() {
        objects = new ArrayList<>();
    }

    public String getResultB() {
        ExplicitVisitorB visitorB = new ExplicitVisitorB();

        for (Element element : objects) {
            element.take(visitorB);
        }
        return visitorB.getResultB();
    }

    public String getResultA() {
        ExplicitVisitorA visitorA = new ExplicitVisitorA();

        for (Element element : objects) {
            element.take(visitorA);
        }

        return visitorA.getResultA();
    }

    public void add(Element element) {
        if (!objects.contains(element))
            objects.add(element);
    }
}
