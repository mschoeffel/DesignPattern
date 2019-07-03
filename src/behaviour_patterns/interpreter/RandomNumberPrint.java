package behaviour_patterns.interpreter;

public class RandomNumberPrint extends TestdataPrint {

    @Override
    public String interprete(Context context) {
        int randomNumber = (int) (Math.random() * 100);
        return Integer.toString(randomNumber);
    }
}
