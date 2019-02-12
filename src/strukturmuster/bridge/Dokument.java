package strukturmuster.bridge;

public abstract class Dokument 
{
	private StorageProvider storageProvider;
	private int belegNummer;
	private Blob blob;
	
	public Dokument(StorageProvider storageProvider, int belegNummer)
	{
		this.storageProvider = storageProvider;
		this.belegNummer = belegNummer;
	}
	
	public StorageProvider getStorageProvider()
	{
		return storageProvider;
	}
	
	public abstract void lade(int belegNummer);
	public abstract void speichere();
	public abstract Blob erstelleDruckbild();

	public int getBelegNummer() 
	{
		return belegNummer;
	}
	public void setBelegNummer(int belegNummer)
	{
		this.belegNummer = belegNummer;
	}

	public Blob getBlob() 
	{
		return blob;
	}
	public void setBlob(Blob blob) 
	{
		this.blob = blob;
	}
}
