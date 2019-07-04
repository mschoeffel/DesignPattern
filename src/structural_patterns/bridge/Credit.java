package structural_patterns.bridge;

public class Credit extends Document {
    private int invoiceNumber;
    private Blob blob;

    public Credit(StorageProvider storageProvider, int documentNumber, int invoiceNumber) {
        super(storageProvider, documentNumber);
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public void load(int documentNumber) {
        setBlob(getStorageProvider().load(String.valueOf(documentNumber)));
        blob = getStorageProvider().load(String.valueOf(invoiceNumber));
        setDocumentNumber(documentNumber);
    }

    @Override
    public void save() {
        getStorageProvider().save(print(), String.valueOf(getDocumentNumber()));
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public Blob print() {
        //Render PDF and return
        return new Blob("PDF-Inhalt");
    }
}
