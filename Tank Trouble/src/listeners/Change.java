package listeners;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import main.Window;

public class Change implements ChangeListener
{
	public int sliderValue;
	public String sliderValueS;	
	@Override
	public void stateChanged(ChangeEvent event) 
	{
		if (event.getSource() == Window.sldMasterSound)
		{
			sliderValue = Window.sldMasterSound.getValue();
			sliderValueS = Integer.toString(sliderValue);
		}
	}
}
