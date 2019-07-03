package structural_patterns.bridge;


import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesystemProvider extends StorageProvider
{
	private String path;

	public FilesystemProvider(String path)
	{
		this.path = path;
	}
	
	@Override
	public Blob load(String refId) 
	{
		try
		{
			Scanner in = new Scanner(new FileReader(path+refId));
			Blob blob = new Blob(in.next());
			in.close();
			return blob;
		}
		catch(Exception e)
		{
			return new Blob(e.getMessage());
		}
	}

	@Override
	public void save(Blob blob, String refId) 
	{
		try
		{
			PrintWriter out = new PrintWriter(path+refId);
			out.write(blob.getText());
			out.close();
		}
		catch(Exception e)
		{
			//Nur für Demozwecke
		}
	}
}
