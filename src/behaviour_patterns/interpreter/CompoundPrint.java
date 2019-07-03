package behaviour_patterns.interpreter;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CompoundPrint extends TestdataPrint {

    private ArrayList<TestdataPrint> prints;

    public CompoundPrint() {
        prints = new ArrayList<>();
    }

    public void addPrint(TestdataPrint print) {
        prints.add(print);
    }

    public ArrayList<TestdataPrint> getPrints() {
        return prints;
    }

    @Override
    public String interprete(Context context) {
        return prints.stream().map(testdataPrint -> testdataPrint.interprete(context)).collect(Collectors.joining());
    }
}
