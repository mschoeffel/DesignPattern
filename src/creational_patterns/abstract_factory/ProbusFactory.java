package creational_patterns.abstract_factory;

public class ProbusFactory extends HomeAutomationFactory {
    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new ProbusTemperatureSensor();
    }

    @Override
    public BlindsActuator createBlindsActuator() {
        return new ProbusBlindsActuator();
    }
}
