package creational_patterns.abstractfactory;

public class Client {

    public static void main(String[] args){
        HeimautomationFabrik fabrik = new HomebusFabrik();

        HeimController controller = new HeimController(fabrik);

        float temperatur = controller.getAktuelleTemperatur();

        controller.ab(12f);

    }
}
