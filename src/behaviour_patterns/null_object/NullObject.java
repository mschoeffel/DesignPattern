package behaviour_patterns.null_object;

public final class NullObject implements CustomObject{

    private static NullObject instance = new NullObject();

    private NullObject(){}

    public static NullObject getInstance(){
        return instance;
    }

    @Override
    public void work() {
        //Do nothing
    }

    @Override
    public void printData() {
        //Do nothing
    }
}
