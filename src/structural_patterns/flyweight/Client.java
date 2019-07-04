package structural_patterns.flyweight;

public class Client {

    public static void main(String[] args) {
        SensorFactory factory = new SensorFactory();
        Sensor sensor = factory.getSensor("TE");
        sensor.write(309.5);
    }
}
