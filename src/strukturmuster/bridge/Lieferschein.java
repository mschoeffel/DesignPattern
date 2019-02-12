package strukturmuster.bridge;

public class Lieferschein extends Dokument
{

	public Lieferschein(StorageProvider storageProvider, int belegNummer) 
	{
		super(storageProvider, belegNummer);
	}

	@Override
	public void lade(int belegNummer) 
	{
		setBlob(getStorageProvider().load(String.valueOf(belegNummer)));
	}

	@Override
	public void speichere() 
	{
		getStorageProvider().save(erstelleDruckbild(), String.valueOf(getBelegNummer()));
	}

	@Override
	public Blob erstelleDruckbild() 
	{
		return new Blob("PDF-Inhalt");
	}
}
