package other_patterns.double_checked_locking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataStorage {

    private final int inventorySize;
    private final List<DataObject> items;
    private final Lock lock;

    public DataStorage(int inventorySize) {
        this.inventorySize = inventorySize;
        this.items = new ArrayList<>(inventorySize);
        this.lock = new ReentrantLock();
    }

    public boolean addItem(DataObject obj) {
        if (items.size() < inventorySize) {
            lock.lock();
            System.out.println("Lock set");
            try {
                if (items.size() < inventorySize) {
                    items.add(obj);
                    System.out.println("Added to the Storage: " + obj);
                    return true;
                }
            } finally {
                lock.unlock();
                System.out.println("Lock unset");
            }
        }
        return false;
    }

}
