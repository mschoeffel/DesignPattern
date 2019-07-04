package creational_patterns.abstract_factory;

public class ProbusTemperatureSensor extends TemperatureSensor {

    @Override
    public float getTemperature() {
        //Get actual temperature
        float temperature = 42;
        setActualTemperature(temperature);
        return temperature;
    }
}
