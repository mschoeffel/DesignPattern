package structural_patterns.facade;

public class ClientA {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation("ClientA");
    }
}
