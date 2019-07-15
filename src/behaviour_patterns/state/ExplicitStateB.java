package behaviour_patterns.state;

public class ExplicitStateB implements StateInterface {

    public ExplicitStateB() {
    }

    @Override
    public void opertaion() {
        System.out.println("ExplicitState B worked");
    }

}
