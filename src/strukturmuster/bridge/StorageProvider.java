package strukturmuster.bridge;

public abstract class StorageProvider 
{
	public abstract Blob load(String refId);
	public abstract void save(Blob blob, String refId);
}
