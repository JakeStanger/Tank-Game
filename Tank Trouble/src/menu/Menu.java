package menu;

import main.Window;

public class Menu
{	
	public Menu()
	{
		Listener listener = new Listener();
		
		//Add ActionListeners
		Window.btnExit.addActionListener(listener);
		Window.btnPlayS.addActionListener(listener);
		Window.btnPlayM.addActionListener(listener);
		Window.btnOptions.addActionListener(listener);
		Window.btnFiller.addActionListener(listener);
		Window.btnBack.addActionListener(listener);
		
		System.out.println("Menu class loaded");
	}
}