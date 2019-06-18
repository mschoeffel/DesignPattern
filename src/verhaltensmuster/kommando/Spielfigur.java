package verhaltensmuster.kommando;

public abstract class Spielfigur {
    private boolean isComputer;
    private Position position;

    public Spielfigur(boolean isComputer, Position starterPosition){
        this.isComputer = isComputer;
        this.position = starterPosition;
    }

    public void bewege(Position neuePosition){
        validiereBewegung(neuePosition);
        position = neuePosition;
    }

    protected void validiereBewegung(Position neuePosition){
        if(neuePosition.x < 1 || neuePosition.x > 8){
            throw new RuntimeException("X-Position muss zwischen 1 und 8 liegen");
        }
        if(neuePosition.y < 1 || neuePosition.y > 8){
            throw new RuntimeException("Y-Position muss zwischen 1 und 8 liegen");
        }
    }


    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
