package behaviour_patterns.null_object;

public class DataObject implements CustomObject {

    private String data;

    public DataObject(String data){
        this.data = data;
    }

    @Override
    public void work() {
        data += " | worked | ";
    }

    @Override
    public void printData() {
        System.out.println(data);
    }
}
