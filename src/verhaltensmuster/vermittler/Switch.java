package verhaltensmuster.vermittler;

public interface Switch {
    public void verbinde(Teilnehmer teilnehmer, Teilnehmer gegenstelle) throws SwitchException;
    public void konferenz(Teilnehmer teilnehmer, Teilnehmer[] gegenstellen) throws  SwitchException;
    public void trenne(Teilnehmer teilnehmer, Teilnehmer gegenstelle) throws SwitchException;
}
