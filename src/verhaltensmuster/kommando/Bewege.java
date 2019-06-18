package verhaltensmuster.kommando;

public class Bewege extends Spielzug {

    private Position neuePosition;
    private Position altePosition;

    public Bewege(Spielfigur figur, Position neuePosition){
        super(figur);
        this.neuePosition = neuePosition;
    }

    @Override
    public void ausfuehren() {
        this.altePosition = getFigur().getPosition();
        getFigur().bewege(neuePosition);
        System.out.println("Spielfigur bewegt");
    }

    @Override
    public void undo() {
        getFigur().bewege(altePosition);
        System.out.println("Spielfigur zurück bewegt");
    }
}
