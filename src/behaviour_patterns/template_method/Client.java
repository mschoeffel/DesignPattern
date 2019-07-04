package behaviour_patterns.template_method;

import java.io.IOException;

public class Client {

    public static void main(String[] args) {

        OutputStream outputStream = new MyOutputStream();

        int data = 10;

        try {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
