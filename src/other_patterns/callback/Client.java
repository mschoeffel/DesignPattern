package other_patterns.callback;

public class Client {

    public static void main(String[] args){
        Task task = new ExplicitTask();
        Callback callback = () -> System.out.println("Callback was called.");

        task.executeWith(callback);
    }

}
