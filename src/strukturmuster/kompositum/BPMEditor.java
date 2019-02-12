package strukturmuster.kompositum;

public class BPMEditor 
{
	public void Starte()
	{
		BPMSequenz lagerEingangWorkflow = new BPMSequenz(1);
		
		BPMKomponente ausgabe = new BPMKonsolenausgabe(2, "Neue Ware ist da");
		lagerEingangWorkflow.fuegeHinzu(ausgabe);
		
		BPMSequenz warenPruefung = new BPMSequenz(3);
		BPMKomponente informiereLabor = new BPMKonsolenausgabe(4, "Bitte Stichprobe ziehen");
		warenPruefung.fuegeHinzu(informiereLabor);
		lagerEingangWorkflow.fuegeHinzu(warenPruefung);
		
		lagerEingangWorkflow.starte();
	}
}
