package behaviour_patterns.strategy;

public class Client {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addMovement(new Movement(10, 2)); //20
        warehouse.addMovement(new Movement(10, 3)); //30
        warehouse.addMovement(new Movement(22, 2)); //44
        warehouse.addMovement(new Movement(30, 5)); //150
        warehouse.addMovement(new Movement(8, 10)); //80

        warehouse.setActualRating(new AvgRating());
        System.out.println("Rating with Avg: " + warehouse.rate());

        warehouse.setActualRating(new NormalRating());
        System.out.println("Rating with Normal: " + warehouse.rate());
    }

}
