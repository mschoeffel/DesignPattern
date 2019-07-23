package other_patterns.marker;

public class Client {

    public static void main(String[] args){
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        if(objectA instanceof Marker){
            objectA.access();
        } else{
            System.out.println("ObjectA doesn't have permission.");
        }
        
        if(objectB instanceof Marker){
            objectB.access();
        } else{
            System.out.println("ObjectB doesn't have permission.");
        }
    }

}
