package behaviour_patterns.iterator;

public class Client {

    public static void main(String[] args) {
        ExplicitAggregate<String> data = new ExplicitAggregate<>();

        data.addList("Element1");
        data.addList("Element2");
        data.addList("Element3");

        Iterator<String> iterator = data.createIterator();
        while (!iterator.isFinished()) {
            iterator.next();
            System.out.println(iterator.currentElement());
        }
    }
}
