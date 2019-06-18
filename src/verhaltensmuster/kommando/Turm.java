package verhaltensmuster.kommando;

public class Turm extends Spielfigur {

    public Turm(boolean isComputer, Position starterPosition) {
        super(isComputer, starterPosition);
    }

    @Override
    protected void validiereBewegung(Position neuePosition) {
        if(neuePosition.x != getPosition().x && neuePosition.y != getPosition().y){
            throw new RuntimeException("Der Turm darf nicht diagonal bewegt werden");
        }
    }
}
