package verhaltensmuster.vermittler;

public class Telefonanlage implements Switch {

    @Override
    public void verbinde(Teilnehmer teilnehmer, Teilnehmer gegenstelle) throws SwitchException {
        if(gegenstelle.istBelegt())
            throw new SwitchException("Teilnehmer " + gegenstelle.getRufnummer() + " ist belegt");
        teilnehmer.verbinde(gegenstelle);
    }

    @Override
    public void konferenz(Teilnehmer teilnehmer, Teilnehmer[] gegenstellen) throws SwitchException {
        if(gegenstellen.length == 0 || gegenstellen.length > 4)
            throw new SwitchException("Konferenz nur zwischen 2 und 5 Teilnehmern möglich");
        for (Teilnehmer gegenstelle : gegenstellen) {
            if(gegenstelle.istBelegt())
                throw new SwitchException("Teilnehmer " + gegenstelle.getRufnummer() + " ist belegt");
            teilnehmer.verbinde(gegenstelle);
        }
    }

    @Override
    public void trenne(Teilnehmer teilnehmer, Teilnehmer gegenstelle) throws SwitchException {
        if(!teilnehmer.istBelegt())
            throw new SwitchException("Teilnehmer " + teilnehmer.getRufnummer() + " hat schon aufgelegt");
        teilnehmer.auflegen();
        if(gegenstelle.istBelegt())
            gegenstelle.auflegen();
    }
}
