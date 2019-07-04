package structural_patterns.bridge;

public class Invoice extends Document {

    public Invoice(StorageProvider storageProvider, int documentNumber) {
        super(storageProvider, documentNumber);
    }

    @Override
    public void load(int documentNumber) {
        setBlob(getStorageProvider().load(String.valueOf(documentNumber)));
    }

    @Override
    public void save() {
        getStorageProvider().save(print(), String.valueOf(getDocumentNumber()));
    }

    @Override
    public Blob print() {
        return new Blob("PDF-Body");
    }
}
