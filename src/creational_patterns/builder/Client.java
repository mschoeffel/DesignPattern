package creational_patterns.builder;

public class Client {

    public static void main(String[] args){
        Director director = new Director();
        Product product = director.constructDefaultProduct();
    }
}
