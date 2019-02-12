package strukturmuster.kompositum;

public abstract class BPMKomponente 
{
	private int id;
	protected BPMKomponente elternObjekt = null;
	
	public abstract void zeichne();
	public abstract void starte();
	
	public BPMKomponente(int id)
	{
		this.id = id;
	}
	
	public BPMKomponente getElternObjekt()
	{
		return elternObjekt;
	}
	
	public void setElternObjekt(BPMKomponente elternObjekt)
	{
		this.elternObjekt = elternObjekt;
	}
}

