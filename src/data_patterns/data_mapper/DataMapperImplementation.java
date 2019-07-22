package data_patterns.data_mapper;

import java.util.Optional;

public class DataMapperImplementation implements DataMapper {

    @Override
    public Optional<DataObject> find(int id) {
        System.out.println("DataObject with id: " + id + " was found / or not found in database.");

        //If found return the DataObject

        //If not found:
        return Optional.empty();
    }

    @Override
    public void insert(DataObject obj) {
        System.out.println("DataObject: " + obj.getName() + " was inserted to database.");
    }

    @Override
    public void update(DataObject obj) {
        System.out.println("DataObject " + obj.getName() + " was updated in database.");
    }

    @Override
    public void delete(DataObject obj) {
        System.out.println("DataObject " + obj.getName() + " was deleted from database.");
    }
}
