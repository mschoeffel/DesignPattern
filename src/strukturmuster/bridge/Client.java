package strukturmuster.bridge;

public class Client {

    public static void main(String[] args){
        StorageProvider storageProvider = new FilesystemProvider("C:/temp");
        Gutschrift gutschrift = new Gutschrift(storageProvider, 1234, 456);
        gutschrift.speichere();

        gutschrift.lade(1234);
    }
}
