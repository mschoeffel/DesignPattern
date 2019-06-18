package verhaltensmuster.kommando;

public class Schachspiel {

    Spielfeld spielfeld;

    public Schachspiel(){
        spielfeld = new Spielfeld();
    }

    public void spielfigurGezogen(Spielfigur spielfigur, Position neuePosition){
        Bewege bewege = new Bewege(spielfigur, neuePosition);
        spielfeld.QueueSpielzug(bewege);
        spielfeld.spiele();
    }

    public void undo(){
        spielfeld.undo();
    }
}
