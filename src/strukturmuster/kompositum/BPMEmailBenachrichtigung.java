package strukturmuster.kompositum;

public class BPMEmailBenachrichtigung extends BPMKomponente
{
	private String empfaenger, absender, betreff, text;

	public BPMEmailBenachrichtigung(int id, String empfaenger, String absender, String betreff, String text) 
	{
		super(id);
		this.empfaenger = empfaenger;
		this.absender = absender;
		this.betreff = betreff;
		this.text = text;
	}

	@Override
	public void zeichne() 
	{
		//Zeichnen
	}

	@Override
	public void starte() 
	{
		//Email versenden
	}
}
