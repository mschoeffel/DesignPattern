package creational_patterns.abstract_factory;

public class Client {

    public static void main(String[] args) {
        HomeAutomationFactory fabric = new HomeBusFactory();

        HomeController controller = new HomeController(fabric);

        float temperature = controller.getActualTemperature();

        controller.close(12f);

    }
}
