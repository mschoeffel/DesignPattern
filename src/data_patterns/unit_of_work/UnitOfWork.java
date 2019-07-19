package data_patterns.unit_of_work;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {

    private List<Entity> entityDelete;
    private List<Entity> entityAdd;

    public UnitOfWork(){
        entityAdd = new ArrayList<>();
        entityDelete = new ArrayList<>();
    }

    public void registerNew(Entity entity){
        if(entityDelete.contains(entity)){
            System.out.println("Entity already to delete");
            return;
        }
        if(entityAdd.contains(entity)){
            System.out.println("Entity already to add");
            return;
        }
        entityAdd.add(entity);
    }

    public void registerDelete(Entity entity){
        if(entityDelete.contains(entity)){
            System.out.println("Entity already to delete");
            return;
        }
        if(entityAdd.contains(entity)){
            System.out.println("Entity already to add");
            return;
        }
        entityDelete.add(entity);
    }

    public void commit(){
        entityAdd.forEach(entity -> System.out.println("Entity added: " + entity.getName()));
        entityDelete.forEach(entity -> System.out.println("Entity deleted: " + entity.getName()));
        entityAdd.clear();
        entityDelete.clear();
    }

    public void rollback(){
        entityDelete.clear();
        entityAdd.clear();
        System.out.println("Unit of Work cleared");
    }

}
