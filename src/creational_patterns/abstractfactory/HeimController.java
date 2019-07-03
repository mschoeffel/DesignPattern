package creational_patterns.abstractfactory;

public class HeimController {

    HeimautomationFabrik fabrik;

    TemperaturSensor temperaturSensor;
    JalousieAktor jalousieAktor;

    public HeimController(HeimautomationFabrik fabrik){
        this.fabrik = fabrik;
        erzeugeProdukte();
    }

    private void erzeugeProdukte(){
        temperaturSensor = fabrik.erzeugeTemperaturSensor();
        jalousieAktor = fabrik.erzeugeJalousieAktor();
    }

    public float getAktuelleTemperatur(){
        temperaturSensor.holeTemperatur();
        return temperaturSensor.getAktuelleTemperatur();
    }

    public void auf(float wert){
        jalousieAktor.auf(wert);
    }

    public void ab(float wert){
        jalousieAktor.ab(wert);
    }
}
