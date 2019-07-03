package behaviour_patterns.mediator;

public interface Switch {
    public void connect(Member member, Member otherMember) throws SwitchException;

    public void conference(Member member, Member[] otherMembers) throws SwitchException;

    public void disconnect(Member member, Member otherMember) throws SwitchException;
}
