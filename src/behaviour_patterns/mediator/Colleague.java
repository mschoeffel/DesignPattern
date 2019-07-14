package behaviour_patterns.mediator;

public abstract class Colleague {

    private Mediator mediator;
    private String data;

    public Colleague(Mediator mediator, String data){
        this.mediator = mediator;
        this.data = data;
    }

    public void operation(){
        mediator.notification(this);
    }

    public String getData(){
        return data;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
