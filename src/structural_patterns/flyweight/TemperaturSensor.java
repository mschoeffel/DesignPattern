package structural_patterns.flyweight;

public class TemperaturSensor extends Sensor {

    public TemperaturSensor(double kalibrierWert){
        super(kalibrierWert);
    }

    protected double rechneUm(double messwert){
        return messwert - 273.15;
    }
}
