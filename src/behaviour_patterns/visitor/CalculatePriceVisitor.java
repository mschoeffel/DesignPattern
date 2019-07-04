package behaviour_patterns.visitor;

public class CalculatePriceVisitor extends Visitor {

    private float price;

    public CalculatePriceVisitor() {
        price = 0;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void visitBook(Book book) {
        price += book.getPrice() * book.getCount();
    }
}
