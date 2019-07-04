package creational_patterns.factory_method;

public class Client {

    public static void main(String[] args) {
        InvoiceCalculator invoiceCalculator = new CreditInvoiceCalculator();
        Document document = invoiceCalculator.createDocument();
        document.setDocumentNumber(123456);
        ((Credit) document).setCreditValue(10.00f);
        invoiceCalculator.calculateDocument();
    }
}
