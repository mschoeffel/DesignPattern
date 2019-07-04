package creational_patterns.abstract_factory;

public abstract class BlindsActuator {

    private float actualPosition;

    public float getActualPosition() {
        return actualPosition;
    }

    public void open(float number) {
        float targetValue = actualPosition - number;
        if (actualPosition < 0)
            actualPosition = 0;
        //open blinds
    }

    public void close(float number) {
        float targetValue = actualPosition + number;
        if (actualPosition > 100)
            actualPosition = 100;
        //Close blinds
    }

}
