package info;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Error 
{
	JFrame frame = main.Window.frame;
	
	public Error(String event)
	{
		JOptionPane.showMessageDialog(frame, "An error occured while " + event, "Error Occurred", JOptionPane.ERROR_MESSAGE);
	}
}
