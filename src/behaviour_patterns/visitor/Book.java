package behaviour_patterns.visitor;

public class Book extends Element {

    public Book(int count, float price, String title) {
        super(count, price, title);
    }

    public String isbn;
    public String autor;
    public String publisher;

    @Override
    public void take(Visitor visitor) {
        visitor.visitBook(this);
    }
}
