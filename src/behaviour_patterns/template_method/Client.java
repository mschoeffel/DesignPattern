package behaviour_patterns.template_method;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        AbstractClass abstractClass = new ExplicitClass();

        List<String> data = new LinkedList<>();
        data.add("One");
        data.add("Two");
        data.add("Three");

        abstractClass.templateMethod(data);

    }

}
