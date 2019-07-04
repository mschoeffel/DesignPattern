package behaviour_patterns.strategy;

public class AvgRating extends Rating {

    @Override
    public float rate(Warehouse warehouse) {
        float actualStock = super.calculateActualStock(warehouse);
        float value = 0;
        int totalQuantity = 0;

        for (Movement movement : warehouse.getStock()) {
            if (movement.count > 0) {
                value += movement.count * movement.price;
                totalQuantity += movement.count;
            }
        }

        return (warehouse.getStock().size() * (value / totalQuantity));
    }
}
