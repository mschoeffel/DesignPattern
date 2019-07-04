package behaviour_patterns.strategy;

public abstract class Rating {

    public abstract float rate(Warehouse warehouse);

    protected float calculateActualStock(Warehouse warehouse) {
        float stock = 0;
        for (Movement movement : warehouse.getStock()) {
            stock += movement.count;
        }
        return stock;
    }

}
