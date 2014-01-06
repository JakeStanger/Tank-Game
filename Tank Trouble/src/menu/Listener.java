package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import options.Options;
import main.Window;

public class Listener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if (event.getSource() == Window.exit)
		{
			System.out.println("Application will now close");
			System.exit(0);
		}
		
		if (event.getSource() == Window.playS)
		{
			System.out.println("Singleplayer clicked");
			new game.render.LoadElements();
		}
		
		if (event.getSource() == Window.playM)
		{
			System.out.println("Multiplayer clicked");
		}
		
		if (event.getSource() == Window.options)
		{
			System.out.println("Options clicked");
			new Options();
		}
		
		if (event.getSource() == Window.language)
		{
			System.out.println("Language clicked");
		}
		
		
		
		if (event.getSource() == Window.btnGraphics)
		{
			System.out.println("Graphics options clicked");
		}
		
		if (event.getSource() == Window.btnBack)
		{
			System.out.println("Returning to main menu");
			Window.switchTo("Main Menu");
		}
	}
	
	public Listener()
	{
		System.out.println("Listener class loaded");
	}
}
