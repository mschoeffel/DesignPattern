package structural_patterns.bridge;

public class Client {

    public static void main(String[] args) {
        StorageProvider storageProvider = new FilesystemProvider("C:/temp");
        Credit credit = new Credit(storageProvider, 1234, 456);
        credit.save();

        credit.load(1234);
    }
}
