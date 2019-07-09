package structural_patterns.facade;

public class Facade {

    public void operation(String source){
        if(source.equals("ClientA")){
            SubsystemA subsystemA = new SubsystemA();
            subsystemA.operation();
        } else if(source.equals("ClientB")){
            SubsystemB subsystemB = new SubsystemB();
            subsystemB.operation();
        } else{
            System.out.println("Unknown source");
        }
    }

}
