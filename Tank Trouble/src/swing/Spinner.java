package swing;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class Spinner extends JSpinner
{
	public Spinner()
	{
		Font font = new Font("ARMY RUST", Font.BOLD, 32);
		this.setFont(font);
		this.setAutoscrolls(true);
		
		JComponent field = ((JSpinner.DefaultEditor) this.getEditor());
	    Dimension prefSize = field.getPreferredSize();
	    prefSize = new Dimension(30, prefSize.height);
	    field.setPreferredSize(prefSize);
	    
	    SpinnerNumberModel model = new SpinnerNumberModel(50, 0, 100, 1);
	    this.setModel(model);
	    
	}
}
