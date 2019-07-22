package data_patterns.data_mapper;

import java.util.Optional;

public interface DataMapper {
    Optional<DataObject> find(int id);
    void insert(DataObject obj);
    void update(DataObject obj);
    void delete(DataObject obj);
}
