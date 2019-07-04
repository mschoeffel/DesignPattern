package creational_patterns.factory_method_more;

import creational_patterns.factory_method.Invoice;

public class Client {

    public static void main(String[] args) {
        creational_patterns.factory_method.InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
        Invoice invoice = ((InvoiceCalculator) invoiceCalculator).createInvoice(InvoiceType.CASH_ON_DELIVERY_INVOICE);
        invoice.setDocumentNumber(123456);
        invoiceCalculator.calculateDocument();
    }
}
