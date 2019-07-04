package creational_patterns.factory_method;

public class Credit extends Document {
    private float creditValue;

    public float getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(float creditValue) {
        this.creditValue = creditValue;
    }

    @Override
    public boolean isValid() {
        return super.isValid() && (creditValue > 0);
    }
}
