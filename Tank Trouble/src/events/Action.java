package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import options.*;
import main.Window;

public class Action implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if (event.getSource() == Window.btnExit)
		{
			System.out.println("Application will now close");
			System.exit(0);
		}
		
		if (event.getSource() == Window.btnPlayS)
		{
			System.out.println("Singleplayer clicked");
			new game.render.LoadElements();
		}
		
		if (event.getSource() == Window.btnPlayM)
		{
			System.out.println("Multiplayer clicked");
		}
		
		if (event.getSource() == Window.btnOptions)
		{
			System.out.println("Options clicked");
			new Options();
		}
		
		if (event.getSource() == Window.btnFiller)
		{
			System.out.println("Language clicked. This button shall be removed soon and is a place filler");
		}
		
		
		
		if (event.getSource() == Window.btnGraphics)
		{
			System.out.println("Graphics options clicked");
		}
		
		if (event.getSource() == Window.btnSound)
		{
			System.out.println("Audio options clicked");
			new Audio();
		}
		
		
		
		if (event.getSource() == Window.btnBack)
		{
			System.out.println("Returning to the main menu");
			Window.switchTo("Main Menu");
		}
	}
	
	public Action()
	{
		System.out.println("Listener class loaded");
	}
}
