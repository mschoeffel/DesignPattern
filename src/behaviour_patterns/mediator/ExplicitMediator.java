package behaviour_patterns.mediator;

public class ExplicitMediator implements Mediator {

    @Override
    public void notification(Colleague colleague) {
        System.out.println("Explicit Mediator was notified by: " + colleague);
        System.out.println("The requested Data: " + colleague.getData());
    }
}
