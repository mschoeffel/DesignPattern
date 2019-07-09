package structural_patterns.wrapper;

public class Client {

    public static void main(String[] args){
        Component decorator1 = new ExplicitDecoratorA();
        Component decorator2 = new ExplicitDecoratorB();
        Component decorator3 = new ExplicitDecoratorA();
        ((ExplicitDecoratorA) decorator1).addComponent(decorator2);
        ((ExplicitDecoratorA) decorator1).addComponent(decorator3);
        ((ExplicitDecoratorA) decorator1).addComponent(new ExplicitObject());
        ((ExplicitDecoratorB) decorator2).addComponent(new ExplicitObject());
        ((ExplicitDecoratorB) decorator2).addComponent(new ExplicitObject());
        ((ExplicitDecoratorA) decorator3).addComponent(new ExplicitObject());

        decorator1.operation();
    }
}
