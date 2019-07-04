package creational_patterns.abstract_factory;

public abstract class HomeAutomationFactory {

    public abstract TemperatureSensor createTemperatureSensor();

    public abstract BlindsActuator createBlindsActuator();
}
