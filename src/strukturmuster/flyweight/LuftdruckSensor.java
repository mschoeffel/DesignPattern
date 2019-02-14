package strukturmuster.flyweight;

public class LuftdruckSensor extends Sensor{

    public LuftdruckSensor(double kalibrierWert){
        super(kalibrierWert);
    }

    protected double rechneUm(double messwert){
        return messwert * 0.18;
    }
}
