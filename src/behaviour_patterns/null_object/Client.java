package behaviour_patterns.null_object;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args){

        List<CustomObject> list = new LinkedList<>();
        list.add(new DataObject("Object 1"));
        list.add(new DataObject("Object 2"));
        list.add(NullObject.getInstance());
        list.add(new DataObject("Object 3"));
        list.add(NullObject.getInstance());
        list.add(new DataObject("Object 4"));

        list.forEach(CustomObject::work);
        list.forEach(CustomObject::printData);
    }
}
