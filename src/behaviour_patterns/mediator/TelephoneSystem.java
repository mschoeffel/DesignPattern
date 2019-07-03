package behaviour_patterns.mediator;

public class TelephoneSystem implements Switch {

    @Override
    public void connect(Member member, Member otherMember) throws SwitchException {
        if (otherMember.isNotAvailable())
            throw new SwitchException("Member " + otherMember.getNumber() + " is not available");
        member.connect(otherMember);
    }

    @Override
    public void conference(Member member, Member[] otherMembers) throws SwitchException {
        if (otherMembers.length == 0 || otherMembers.length > 4)
            throw new SwitchException("Conference is only between 2 and 5 members possible");
        for (Member otherMember : otherMembers) {
            if (otherMember.isNotAvailable())
                throw new SwitchException("Member " + otherMember.getNumber() + " is not available");
            member.connect(otherMember);
        }
    }

    @Override
    public void disconnect(Member member, Member otherMember) throws SwitchException {
        if (!member.isNotAvailable())
            throw new SwitchException("Member " + member.getNumber() + " disconnected");
        member.disconnect();
        if (otherMember.isNotAvailable())
            otherMember.disconnect();
    }
}
