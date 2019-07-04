package structural_patterns.flyweight;

public abstract class Sensor {

    private double calibrateFactor;

    public Sensor(double calibrateFactor) {
        this.calibrateFactor = calibrateFactor;
    }

    public void write(double measuredValue) {
        double calibratedValue = measuredValue * calibrateFactor;
        double convertedValue = convert(calibratedValue);
        writeToDatabase(convertedValue);
    }

    protected double convert(double measuredValue) {
        return measuredValue;
    }

    private void writeToDatabase(double value) {
        //Write to database
    }
}
