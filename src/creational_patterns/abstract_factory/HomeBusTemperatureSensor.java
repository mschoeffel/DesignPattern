package creational_patterns.abstract_factory;

public class HomeBusTemperatureSensor extends TemperatureSensor {
    @Override
    public float getTemperature() {
        //Get the temperature
        float temperature = 42;
        setActualTemperature(temperature);
        return temperature;
    }
}
