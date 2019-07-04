package structural_patterns.facade;

public class Client {

    public static void main(String[] args) {
        FacadeEnum resultSnail = FacadeShipmentTracking.track("123456");

        FacadeEnum resultFix = FacadeShipmentTracking.track("123456789");
    }
}
