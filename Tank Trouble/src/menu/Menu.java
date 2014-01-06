package menu;

import main.Window;

public class Menu
{	
	public Menu()
	{
		Listener listener = new Listener();
		
		//Add ActionListeners
		Window.exit.addActionListener(listener);
		Window.playS.addActionListener(listener);
		Window.playM.addActionListener(listener);
		Window.options.addActionListener(listener);
		Window.language.addActionListener(listener);
		Window.btnBack.addActionListener(listener);
		
		System.out.println("Menu class loaded");
	}
}