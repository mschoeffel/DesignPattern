package verhaltensmuster.kommando;

public class Client {

    public static void main(String[] args){
        Schachspiel schachspiel = new Schachspiel();
        Turm t = new Turm(false, new Position((short)1,(short)2));
        schachspiel.spielfigurGezogen(t, new Position((short)5,(short)2));
        schachspiel.undo();
    }
}
