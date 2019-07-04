package creational_patterns.abstract_factory;

public abstract class TemperatureSensor {

    private float actualTemperature;

    public float getActualTemperature() {
        return actualTemperature;
    }

    protected void setActualTemperature(float temperature) {
        actualTemperature = temperature;
    }

    public abstract float getTemperature();
}
