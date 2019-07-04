package behaviour_patterns.template_method;

import java.io.IOException;

public class MyOutputStream extends OutputStream {

    @Override
    public void write(int b) throws IOException {
        System.out.println(b);
    }
}
