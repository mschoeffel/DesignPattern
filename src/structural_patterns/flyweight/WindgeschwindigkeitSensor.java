package structural_patterns.flyweight;

public class WindgeschwindigkeitSensor extends Sensor{

    public WindgeschwindigkeitSensor(double kalibrierWert){
        super(kalibrierWert);
    }

    protected double rechneUm(double messwert){
        return messwert;
    }
}
