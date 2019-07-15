package behaviour_patterns.template_method;

import java.util.List;

public abstract class AbstractClass {
    public abstract void primitiveOperation(String data);

    public void templateMethod(List<String> data)  {
        data.forEach(this::primitiveOperation);
    }
}
