package behaviour_patterns.mediator;

public class Telephone extends Member {

    public Telephone(Switch mediator, int number) {
        super(mediator, number);
    }

    public void call(Member[] members) {
        try {
            getMediator().conference(this, members);
        } catch (SwitchException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
