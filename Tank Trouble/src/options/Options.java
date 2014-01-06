package options;

import javax.swing.Box;
import javax.swing.JPanel;

import main.Window;
import menu.Listener;
import swing.Button;


public class Options 
{
	JPanel pnlMain = Window.pnlMenu;
	JPanel pnlOptions = Window.pnlOptions;
	JPanel pnlMaster = Window.pnlMaster;
	
	Button graphics = Window.btnGraphics;
	Button sound = Window.btnSound;
	Button controls = Window.btnControls;
	Button customize = Window.btnCustomize;
	Button back = Window.btnBack;
	
	public Options()
	{
		Listener listener = new Listener();
		
		pnlOptions.add(Box.createVerticalStrut(50));
		pnlOptions.add(graphics);
		pnlOptions.add(Box.createVerticalStrut(50));
		pnlOptions.add(sound);
		pnlOptions.add(Box.createVerticalStrut(50));
		pnlOptions.add(controls);
		pnlOptions.add(Box.createVerticalStrut(50));
		pnlOptions.add(customize);
		pnlOptions.add(Box.createVerticalStrut(50));
		pnlOptions.add(back);

	    Window.switchTo("Options");
		
		graphics.addActionListener(listener);
		sound.addActionListener(listener);
		
		System.out.println("Options class loaded");
	}
}
