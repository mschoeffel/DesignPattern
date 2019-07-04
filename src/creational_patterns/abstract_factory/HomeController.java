package creational_patterns.abstract_factory;

public class HomeController {

    HomeAutomationFactory fabric;

    TemperatureSensor temperatureSensor;
    BlindsActuator blindsActuator;

    public HomeController(HomeAutomationFactory fabric) {
        this.fabric = fabric;
        createProducts();
    }

    private void createProducts() {
        temperatureSensor = fabric.createTemperatureSensor();
        blindsActuator = fabric.createBlindsActuator();
    }

    public float getActualTemperature() {
        temperatureSensor.getTemperature();
        return temperatureSensor.getActualTemperature();
    }

    public void open(float value) {
        blindsActuator.open(value);
    }

    public void close(float value) {
        blindsActuator.close(value);
    }
}
