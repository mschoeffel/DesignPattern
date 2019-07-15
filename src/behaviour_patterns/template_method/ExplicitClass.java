package behaviour_patterns.template_method;


public class ExplicitClass extends AbstractClass {

    @Override
    public void primitiveOperation(String data){
        System.out.println("ExplicitClass: " + data);
    }
}
