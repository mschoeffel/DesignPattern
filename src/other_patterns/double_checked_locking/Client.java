package other_patterns.double_checked_locking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) {
        final DataStorage inventory = new DataStorage(1000);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                while (inventory.addItem(new DataObject())) {
                }
                ;
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Exception: Waiting for ExecutionService shutdown");
        }
    }

}
