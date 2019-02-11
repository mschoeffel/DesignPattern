package erzeugungsmuster.abstractfactory;

public class HomebusTemperaturSensor extends TemperaturSensor {
    @Override
    public float holeTemperatur() {
        //Temperatur erfragen
        float temperatur = 42;
        setAktuelleTemperatur(temperatur);
        return temperatur;
    }
}
