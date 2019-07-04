package structural_patterns.facade;

public class FacadeShipmentTracking {

    public static FacadeEnum track(String trackingNumber) {
        int length = trackingNumber.length();

        switch (length) {
            case 6:
                //Snail Mail
                SnailMailEnum snailMailStatus = SnailMailShipmentTracking.track(Integer.parseInt(trackingNumber));
                return snailMailStatus2FassadeStatus(snailMailStatus);
            case 9:
                //Deliver Fix
                try {
                    DeliveryFixEnum lieferFixStatus = new LieferFixShipmentTracking().checkTrackingStatus(trackingNumber);
                    return lieferFixStatus2FassadeStatus(lieferFixStatus);
                } catch (RuntimeException e) {
                    return FacadeEnum.UNDEFINED;
                }
            default:
                return FacadeEnum.UNDEFINED;
        }
    }

    private static FacadeEnum snailMailStatus2FassadeStatus(SnailMailEnum snailMailStatus) {
        //...
        return FacadeEnum.DETECTED;
    }

    private static FacadeEnum lieferFixStatus2FassadeStatus(DeliveryFixEnum lieferFixStatus) {
        //...
        return FacadeEnum.RECEIVED;
    }
}
