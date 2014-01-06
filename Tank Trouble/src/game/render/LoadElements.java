package game.render;

import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class LoadElements extends Canvas
{
	public static JPanel pnlGame = new JPanel();
	public static Canvas canvas = new Canvas();
	JFrame frame = main.Window.frame;
	
	public LoadElements()
	{
		new game.gui.Health();
	}
}
