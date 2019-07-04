package behaviour_patterns.strategy;

import java.util.ArrayList;

public class Warehouse {

    private ArrayList<Movement> stock;
    private float actualPrice;
    private Rating actualRating;

    public Warehouse() {
        stock = new ArrayList<>();
    }

    public void addMovement(Movement movement) {
        if (!stock.contains(movement))
            stock.add(movement);
    }

    public float rate() {
        if (actualRating != null) {
            return actualRating.rate(this);
        } else {
            throw new RuntimeException("No strategy selected");
        }
    }

    public void setActualPrice(float actualPrice) {
        this.actualPrice = actualPrice;
    }

    public void setActualRating(Rating actualRating) {
        this.actualRating = actualRating;
    }

    public ArrayList<Movement> getStock() {
        return stock;
    }

    public float getActualPrice() {
        return actualPrice;
    }

    public Rating getActualRating() {
        return actualRating;
    }
}
