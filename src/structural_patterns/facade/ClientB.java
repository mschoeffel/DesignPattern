package structural_patterns.facade;

public class ClientB {

    public static void main(String[] args){
        Facade facade = new Facade();
        facade.operation("ClientB");
    }
}
