package structural_patterns.facade;

public class LieferFixShipmentTracking {

    public DeliveryFixEnum checkTrackingStatus(String trackingNumber) {
        if (trackingNumber.length() != 9) {
            throw new RuntimeException("Tracking number is wrong");
        }
        //...
        return DeliveryFixEnum.IN_DELIVERY;
    }
}
