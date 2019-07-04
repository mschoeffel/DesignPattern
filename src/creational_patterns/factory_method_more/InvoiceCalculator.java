package creational_patterns.factory_method_more;

import creational_patterns.factory_method.Document;
import creational_patterns.factory_method.Invoice;

public class InvoiceCalculator extends creational_patterns.factory_method.InvoiceCalculator {
    @Override
    public Document createDocument() {
        return new Invoice();
    }

    public Invoice createInvoice(InvoiceType invoiceType) {
        switch (invoiceType) {
            case CASH_ON_DELIVERY_INVOICE:
                return new CashOnDeliveryInvoice();
            case PARTIAL_PAYMENT_INVOICE:
                return new PartialPaymentInvoice();
            case ADVANCE_INVOICE:
                return new AdvanceInvoice();
            default:
                return new Invoice();
        }
    }
}
