package creational_patterns.factory_method;

public abstract class InvoiceCalculator {
    public abstract Document createDocument();

    public void calculateDocument() {
        Document document = createDocument();
        if (!document.isValid()) {
            throw new IllegalArgumentException(
                    "The Document isn't valid"
            );
        }
        //Work with the document...
    }
}
