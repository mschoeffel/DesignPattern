package structural_patterns.composite;

public class BPMKonsolenausgabe extends BPMKomponente 
{
	private String text;

	public BPMKonsolenausgabe(int id, String text) 
	{
		super(id);
		this.text = text;
	}

	@Override
	public void zeichne() 
	{
		//Zeichnen des Controls
	}

	@Override
	public void starte() 
	{
		System.out.println(text);
	}
}
