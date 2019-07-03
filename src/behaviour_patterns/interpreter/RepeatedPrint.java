package behaviour_patterns.interpreter;

public class RepeatedPrint extends TestdataPrint {

    TestdataPrint print;
    int number;

    public RepeatedPrint(TestdataPrint print, int number) {
        this.print = print;
        this.number = number;
    }

    @Override
    public String interprete(Context context) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            builder.append(print.interprete(context));
        }
        return builder.toString();
    }
}
