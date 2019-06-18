package verhaltensmuster.kommando;

public abstract class Spielzug {

    private Spielfigur figur;

    public Spielzug(Spielfigur figur){
        this.figur = figur;
    }

    public Spielfigur getFigur() {
        return figur;
    }

    public abstract void ausfuehren();
    public abstract void undo();
}
