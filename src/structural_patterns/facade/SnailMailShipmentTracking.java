package structural_patterns.facade;

public class SnailMailShipmentTracking {

    private SnailMailShipmentTracking() {
        throw new AssertionError();
    }

    public static SnailMailEnum track(int trackingNumber) {
        if (trackingNumber < 100000)
            return SnailMailEnum.Undefiniert;
        //...
        return SnailMailEnum.Zugestellt;
    }
}
