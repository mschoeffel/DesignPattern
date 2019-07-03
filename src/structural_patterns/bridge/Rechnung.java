package structural_patterns.bridge;

public class Rechnung extends Dokument 
{

	public Rechnung(StorageProvider storageProvider, int belegNummer) 
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
