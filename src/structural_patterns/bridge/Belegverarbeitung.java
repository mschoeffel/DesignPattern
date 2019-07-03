package structural_patterns.bridge;

public class Belegverarbeitung 
{
	public void arbeite()
	{
		StorageProvider provider = new FilesystemProvider("c:/temp/");
		Gutschrift gutschrift = new Gutschrift(provider, 12345, 67890);
		gutschrift.speichere();
		
		gutschrift.lade(12345);
	}

}
