package options;

import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import main.Window;
import swing.Label;
import swing.Slider;
import swing.Spinner;

public class Audio 
{
	JPanel pnlAudio = Window.pnlAudio;
	Container contentPane = Window.frame.getContentPane();
	
	Slider sldMasterSound = Window.sldMasterSound;
	
	Label lblMasterSound = Window.lblMasterSound;
	
	Spinner spnMasterSound = Window.spnMasterSound;
	
	SpringLayout layout = new SpringLayout();
	
	
	public Audio()
	{
		pnlAudio.setLayout(layout);
		
		pnlAudio.add(lblMasterSound); //Helodhghrghhhjtt
		pnlAudio.add(sldMasterSound);
		pnlAudio.add(spnMasterSound);
		
		positionElements();
		
		Window.switchTo("Audio");
		
		System.out.println("Audio class loaded");
	}
	
	public void positionElements()
	{
		layout.putConstraint(SpringLayout.WEST, lblMasterSound,5, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lblMasterSound,5, SpringLayout.NORTH, contentPane);
		
		layout.putConstraint(SpringLayout.WEST, sldMasterSound, 40, SpringLayout.EAST, lblMasterSound);
		layout.putConstraint(SpringLayout.NORTH, sldMasterSound, 15, SpringLayout.NORTH, contentPane);
		
		layout.putConstraint(SpringLayout.WEST, spnMasterSound, 40, SpringLayout.EAST, sldMasterSound);
		layout.putConstraint(SpringLayout.NORTH, spnMasterSound, 15, SpringLayout.NORTH, contentPane);
	}
}
