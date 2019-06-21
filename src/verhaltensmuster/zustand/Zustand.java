package verhaltensmuster.zustand;

public enum Zustand {
    EINGEGANGEN(new Eingegangen()),
    EINGELADEN(new Eingeladen());

    private ZustandInterface zustandObjekt;

    Zustand(ZustandInterface zustandObjekt){
        this.zustandObjekt = zustandObjekt;
    }

    public ZustandInterface objekt(){
        return zustandObjekt;
    }
}
