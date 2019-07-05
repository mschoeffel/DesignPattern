package creational_patterns.multiton;

public class Client {

    public static void main(String[] args){
        Multiton multiton = Multiton.getMultiton(1);
    }
}
