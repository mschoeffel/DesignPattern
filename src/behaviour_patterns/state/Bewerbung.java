package behaviour_patterns.state;

public class Bewerbung {

    private Zustand zustand;

    public Bewerbung(){
        zustand = Zustand.EINGEGANGEN;
    }

    public Zustand getZustand(){
        return zustand;
    }

    public void setZustand(Zustand zustand){
        if(zustand != this.zustand){
            this.zustand = zustand;
            System.out.println("Zustand vom Objekt hat sich verändert");
        }
    }

    public void benachrichtige(){
        zustand.objekt().benachrichtige();
    }

    public void verarbeite(){
        zustand.objekt().verarbeite();
        if(zustand == Zustand.EINGEGANGEN)
            setZustand(Zustand.EINGELADEN);
    }

}
