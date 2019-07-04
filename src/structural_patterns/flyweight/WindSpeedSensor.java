package structural_patterns.flyweight;

public class WindSpeedSensor extends Sensor {

    public WindSpeedSensor(double calibratedValue) {
        super(calibratedValue);
    }

    protected double convert(double measuredValue) {
        return measuredValue;
    }
}
