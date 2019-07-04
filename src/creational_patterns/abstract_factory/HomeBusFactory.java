package creational_patterns.abstract_factory;

public class HomeBusFactory extends HomeAutomationFactory {

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new HomeBusTemperatureSensor();
    }

    @Override
    public BlindsActuator createBlindsActuator() {
        return new HomeBusBlindsActuator();
    }
}
