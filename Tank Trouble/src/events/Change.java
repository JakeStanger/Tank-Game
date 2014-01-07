package events;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import main.Window;

public class Change implements ChangeListener
{
	public int sliderValue;
	public int spinnerValue;
	
	@Override
	public void stateChanged(ChangeEvent event) 
	{
		if (event.getSource() == Window.sldMasterSound)
		{
			System.out.println("Slider update detected");
			sliderValue = Window.sldMasterSound.getValue();
			spinnerValue = sliderValue;
		}
		
		if (event.getSource() == Window.spnMasterSound)
		{
			System.out.println("Spinner update detected");
			spinnerValue = (int) Window.spnMasterSound.getValue();
			sliderValue = spinnerValue;
		}
	}
}
