package behaviour_patterns.mediator;

public class ExplicitColleagueA extends Colleague {

    public ExplicitColleagueA(Mediator mediator, String data) {
        super(mediator, data);
    }

    @Override
    public void operation() {
        //Do some stuff
        getMediator().notification(this);
    }
}
