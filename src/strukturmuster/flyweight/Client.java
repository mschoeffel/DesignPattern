package strukturmuster.flyweight;

public class Client {

    public static void main(String[] args){
        SensorFabrik fabrik = new SensorFabrik();
        Sensor sensor = fabrik.gibSensor("TE");
        sensor.schreibe(309.5);
    }
}
