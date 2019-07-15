package behaviour_patterns.visitor;

public class Client {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ExplicitElementA("the super A data"));
        objectStructure.add(new ExplicitElementB("second data"));
        objectStructure.add(new ExplicitElementA("third super A data"));
        objectStructure.add(new ExplicitElementB("fourth data"));
        objectStructure.add(new ExplicitElementB("fifth data"));
        objectStructure.add(new ExplicitElementA("sixth super A data"));

        System.out.println("Result A: " + objectStructure.getResultA());
        System.out.println("Result B: " + objectStructure.getResultB());

    }

}
