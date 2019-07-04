package structural_patterns.bridge;

public abstract class Document {
    private StorageProvider storageProvider;
    private int documentNumber;
    private Blob blob;

    public Document(StorageProvider storageProvider, int documentNumber) {
        this.storageProvider = storageProvider;
        this.documentNumber = documentNumber;
    }

    public StorageProvider getStorageProvider() {
        return storageProvider;
    }

    public abstract void load(int documentNumber);

    public abstract void save();

    public abstract Blob print();

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Blob getBlob() {
        return blob;
    }

    public void setBlob(Blob blob) {
        this.blob = blob;
    }
}
