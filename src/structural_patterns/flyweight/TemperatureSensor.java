package structural_patterns.flyweight;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(double calibratedValue) {
        super(calibratedValue);
    }

    protected double convert(double measuredValue) {
        return measuredValue - 273.15;
    }
}
