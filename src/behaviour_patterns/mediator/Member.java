package behaviour_patterns.mediator;

public abstract class Member {

    private Switch mediator;
    private int number;
    private Member currentPartner = null;

    public Member(Switch mediator, int number) {
        this.mediator = mediator;
        this.number = number;
    }

    public boolean isNotAvailable() {
        return currentPartner != null;
    }

    public Switch getMediator() {
        return mediator;
    }

    public int getNumber() {
        return number;
    }

    public void connect(Member otherMember) {
        System.out.println(number + " Connect to member: " + otherMember.getNumber());
        currentPartner = otherMember;
        otherMember.acceptConnection(this);
    }

    public void acceptConnection(Member otherMember) {
        currentPartner = otherMember;
    }

    public void disconnect() {
        System.out.println(number + " Disconnects");
        currentPartner = null;
    }

    public void call(Member otherMember) {
        try {
            mediator.connect(this, otherMember);
        } catch (SwitchException e) {
            System.out.println(number + " Connection error: " + e.getMessage());
        }
    }

    public void diconnectCurrentConnection() {
        if (currentPartner != null) {
            try {
                mediator.disconnect(this, currentPartner);
            } catch (SwitchException e) {
                System.out.println(number + " Connection error: " + e.getMessage());
            }
        }
    }
}
