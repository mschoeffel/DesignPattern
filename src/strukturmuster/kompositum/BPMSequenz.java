package strukturmuster.kompositum;

import java.util.ArrayList;

public class BPMSequenz extends BPMKomponente
{
	ArrayList<BPMKomponente> komponenten;
	

	public BPMSequenz(int id) 
	{
		super(id);
		komponenten = new ArrayList<BPMKomponente>();
	}

	@Override
	public void zeichne() 
	{
		//Zeichnen
	}
	
	public void fuegeHinzu(BPMKomponente komponente)
	{
		if (komponente.elternObjekt != null)
			throw new AssertionError("Das Kindobjekt ist bereits Kind eines anderen Elternobjekts");
		
		if (komponenten.contains(komponente))
			throw new AssertionError("Dieses Kindobjekt ist bereits enthalten");
		
		BPMKomponente zuPruefendeKomponente = komponente.getElternObjekt();
		while (zuPruefendeKomponente != null)
		{
			if (zuPruefendeKomponente == komponente)
				throw new AssertionError("Keine Schleifen erlaubt, Sie wollen doch nicht ewig warten?");
			zuPruefendeKomponente = zuPruefendeKomponente.getElternObjekt();
		}
		
		komponenten.add(komponente);
		komponente.elternObjekt = this;
	}
	
	public void entferne(BPMKomponente komponente)
	{
		if (komponenten.contains(komponente))
			komponenten.remove(komponente);
	}
	
	public BPMKomponente gibKindobjekt(int index)
	{
		if (index >= 0 || index < komponenten.size())
			return komponenten.get(index);
		else
			return null;
	}

	@Override
	public void starte() 
	{
		for (BPMKomponente komponente: komponenten)
		{
			komponente.starte();
		}
	}
}
