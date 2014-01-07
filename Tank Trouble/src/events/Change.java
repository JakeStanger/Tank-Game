package events;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import main.Window;

public class Change implements ChangeListener
{
	public int masterVolume;
	
	@Override
	public void stateChanged(ChangeEvent event) 
	{
		if (event.getSource() == Window.sldMasterSound)
		{
			Window.spnMasterSound.setValue(Window.sldMasterSound.getValue());
			masterVolume = Window.sldMasterSound.getValue();
		}
		
		if (event.getSource() == Window.spnMasterSound)
		{
			Window.sldMasterSound.setValue((int) Window.spnMasterSound.getValue());
			masterVolume = Window.sldMasterSound.getValue();
		}
	}
}
