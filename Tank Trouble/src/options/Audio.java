package options;

import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import main.Window;
import swing.Label;
import swing.Slider;

public class Audio 
{
	public Audio()
	{
		JPanel pnlAudio = Window.pnlAudio;
		Container contentPane = Window.frame.getContentPane();
		Slider sldMasterSound = Window.sldMasterSound;
		Label lblMasterSound = Window.lblMasterSound;
		
		SpringLayout layout = new SpringLayout();
		pnlAudio.setLayout(layout);
		
		layout.putConstraint(SpringLayout.WEST, lblMasterSound,5, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lblMasterSound,5, SpringLayout.NORTH, contentPane);
		
		layout.putConstraint(SpringLayout.WEST, sldMasterSound, 40, SpringLayout.EAST, lblMasterSound);
		layout.putConstraint(SpringLayout.NORTH, sldMasterSound, 15, SpringLayout.NORTH, contentPane);
		
		pnlAudio.add(lblMasterSound);
		pnlAudio.add(sldMasterSound);
		
		Window.switchTo("Audio");
		
		System.out.println("Audio class loaded");
	}
}
