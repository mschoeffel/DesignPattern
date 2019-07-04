package creational_patterns.factory_method;

public abstract class Document {
    private int documentNumber;

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        if (documentNumber > 0) {
            this.documentNumber = documentNumber;
        }
    }

    public boolean isValid() {
        return documentNumber > 0;
    }
}
