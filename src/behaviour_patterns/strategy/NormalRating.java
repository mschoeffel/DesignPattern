package behaviour_patterns.strategy;

public class NormalRating extends Rating {

    @Override
    public float rate(Warehouse warehouse) {
        return super.calculateActualStock(warehouse) * warehouse.getActualPrice();
    }
}
