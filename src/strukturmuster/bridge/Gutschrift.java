package strukturmuster.bridge;

public class Gutschrift extends Dokument 
{
	private int zugehoerigeRechnungsNr;
	private Blob rechnungBlob;
	
	public Gutschrift(StorageProvider storageProvider, int belegNummer, int zugehoerigeRechnungsNr) 
	{
		super(storageProvider, belegNummer);
		this.zugehoerigeRechnungsNr = zugehoerigeRechnungsNr;
	}
	
	@Override
	public void lade(int belegNummer) 
	{
		setBlob(getStorageProvider().load(String.valueOf(belegNummer))); 
		rechnungBlob = getStorageProvider().load(String.valueOf(zugehoerigeRechnungsNr));
		setBelegNummer(belegNummer);
	}

	@Override
	public void speichere() 
	{
		getStorageProvider().save(erstelleDruckbild(), String.valueOf(getBelegNummer()));
	}

	public int getZugehoerigeRechnungsNr() 
	{
		return zugehoerigeRechnungsNr;
	}
	public void setZugehoerigeRechnungsNr(int zugehoerigeRechnungsNr) 
	{
		this.zugehoerigeRechnungsNr = zugehoerigeRechnungsNr;
	}

	@Override
	public Blob erstelleDruckbild() 
	{
		//PDF rendern und zur�ckgeben
		return new Blob("PDF-Inhalt");
	}
}
