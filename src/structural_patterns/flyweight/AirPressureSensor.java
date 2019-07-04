package structural_patterns.flyweight;

public class AirPressureSensor extends Sensor {

    public AirPressureSensor(double calibratedValue) {
        super(calibratedValue);
    }

    protected double convert(double measuredValue) {
        return measuredValue * 0.18;
    }
}
