package creational_patterns.abstractfactory;

public class ProbusTemperaturSensor extends TemperaturSensor {

    @Override
    public float holeTemperatur() {
        //Temperatur erfragen
        float temperatur = 42;
        setAktuelleTemperatur(temperatur);
        return temperatur;
    }
}
