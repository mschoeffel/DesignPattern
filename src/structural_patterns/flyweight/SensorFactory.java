package structural_patterns.flyweight;

import java.util.HashMap;

public class SensorFactory {

    private HashMap<String, Sensor> sensors;

    public SensorFactory() {
        sensors = new HashMap<>();
    }

    public Sensor getSensor(String id) {
        if (!sensors.containsKey(id)) {
            Sensor sensor = null;
            switch (id) {
                case "TE":
                    sensor = new TemperatureSensor(1.012);
                    break;
                case "TI":
                    sensor = new TemperatureSensor(1.015);
                    break;
                case "W":
                    sensor = new WindSpeedSensor(1.094);
                    break;
                case "L":
                    sensor = new AirPressureSensor(1.194);
                    break;
            }
            if (sensor == null)
                throw new RuntimeException("Sensor-ID not known");
            sensors.put(id, sensor);
        }
        return sensors.get(id);
    }
}
