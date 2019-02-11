package erzeugungsmuster.abstractfactory;

public abstract class JalousieAktor {

    private float aktuellePosition;

    public float getAktuellePosition() {
        return aktuellePosition;
    }

    public void auf(float wert){
        float zeilWert = aktuellePosition - wert;
        if (aktuellePosition < 0)
            aktuellePosition = 0;
        //Jalousie aufmachen
    }

    public void ab(float wert){
        float zielWert = aktuellePosition + wert;
        if (aktuellePosition > 100)
            aktuellePosition = 100;
        //Jalousie schließen
    }

}
