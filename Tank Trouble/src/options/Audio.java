package options;

import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import main.Window;
import swing.Button;
import swing.Label;
import swing.Slider;
import swing.Spinner;
import events.Change;

public class Audio 
{
	JPanel pnlAudio = Window.pnlAudio;
	Container contentPane = Window.frame.getContentPane();
	Change changeListener = new Change();
	
	Slider sldMasterSound = Window.sldMasterSound;
	
	Label lblMasterSound = Window.lblMasterSound;
	
	Spinner spnMasterSound = Window.spnMasterSound;
	
	SpringLayout layout = new SpringLayout();
	
	Button btnBack = Window.btnBack;
	
	public Audio()
	{
		pnlAudio.setLayout(layout);
		
		addComponents();
		positionElements();
		addListeners();
		
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
		
		layout.putConstraint(SpringLayout.WEST, btnBack,5, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.SOUTH, btnBack,0, SpringLayout.SOUTH, contentPane);
	}
	
	public void addComponents()
	{
		pnlAudio.add(lblMasterSound);
		pnlAudio.add(sldMasterSound);
		pnlAudio.add(spnMasterSound);
		pnlAudio.add(btnBack);
	}
	
	public void addListeners()
	{
		sldMasterSound.addChangeListener(changeListener);
		spnMasterSound.addChangeListener(changeListener);
	}
}
