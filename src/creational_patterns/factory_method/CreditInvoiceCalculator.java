package creational_patterns.factory_method;

public class CreditInvoiceCalculator extends InvoiceCalculator {

    @Override
    public Document createDocument() {
        return new Credit();
    }
}
