package creational_patterns.abstractfactory;

public abstract class TemperaturSensor {

    private float aktuelleTemperatur;

    public float getAktuelleTemperatur(){
        return aktuelleTemperatur;
    }

    protected void setAktuelleTemperatur(float temperatur){
        aktuelleTemperatur = temperatur;
    }

    public abstract float holeTemperatur();
}
