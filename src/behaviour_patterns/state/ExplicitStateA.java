package behaviour_patterns.state;

public class ExplicitStateA implements StateInterface {

    public ExplicitStateA() {
    }

    @Override
    public void opertaion() {
        System.out.println("ExplicitState A worked");
    }
}
