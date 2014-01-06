package game.render;

import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class LoadElements extends Canvas
{
	public static JPanel pnlGame = new JPanel();
	public static Canvas canvas = new Canvas();
	JFrame frame = new main.Window();
	
	public LoadElements()
	{
		JPanel panel = main.Window.pnlMenu; //Create the new panel
		
		//Re-render the old panel
		frame.add(pnlGame);
		panel.revalidate();
		panel.repaint();
		
		//Add elements
		pnlGame.add(canvas);
		
		//Hide the old panel and display the game one
		panel.setVisible(false);
		pnlGame.setVisible(true);
		
		//Re-render the new one
		pnlGame.revalidate();
		pnlGame.repaint();
		
		//Begin the rendering of the gui
		new game.gui.Health();
	}
}
