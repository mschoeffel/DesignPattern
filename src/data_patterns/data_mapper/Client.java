package data_patterns.data_mapper;

import java.util.Optional;

public class Client {

    public static void main(String[] args){
        DataMapper dataMapper = new DataMapperImplementation();
        DataObject obj = new DataObject(1, "MyTestObject");

        dataMapper.insert(obj);
        dataMapper.update(obj);
        dataMapper.delete(obj);
        Optional<DataObject> result = dataMapper.find(123);

        if(result.isEmpty()){
            System.out.println("DataObject was not found.");
        } else{
            System.out.println("DataObject was found.");
        }
    }
}
