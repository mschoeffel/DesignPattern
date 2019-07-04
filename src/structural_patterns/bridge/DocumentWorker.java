package structural_patterns.bridge;

public class DocumentWorker {
    public void work() {
        StorageProvider provider = new FilesystemProvider("c:/temp/");
        Credit credit = new Credit(provider, 12345, 67890);
        credit.save();

        credit.load(12345);
    }

}
