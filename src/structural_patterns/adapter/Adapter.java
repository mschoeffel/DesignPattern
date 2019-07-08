package structural_patterns.adapter;

public class Adapter extends Target {

    public void operationOfTheTarget() {
        AdaptedClass adaptedClass = new AdaptedClass();
        adaptedClass.operationOfAdaptedClass();
    }
}
