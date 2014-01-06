package info;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import main.Window;

public class ReadInfo 
{
	public ReadInfo()
	{	
		try
		{
			FileReader version = new FileReader( "src/info/version.txt" ) ;
			BufferedReader bufferV = new BufferedReader(version);
			String versionS = "" ;

			while( (versionS = bufferV.readLine()) != null)
			{
				Window.lblVersion.setText(versionS);
			}

			bufferV.close();
		}
		catch( IOException e )
		{
			new Error("reading version file.");
		}
		
		System.out.println("Info reader class loaded");
	}
}
