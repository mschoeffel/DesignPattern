package erzeugungsmuster.abstractfactory;

public abstract class HeimautomationFabrik {

    public abstract TemperaturSensor erzeugeTemperaturSensor();
    public abstract JalousieAktor erzeugeJalousieAktor();
}
