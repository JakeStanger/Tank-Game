package swing;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class Spinner extends JSpinner
{
	public Spinner()
	{
		Font font = new Font("ARMY RUST", Font.BOLD, 32);
		this.setFont(font);
		
		JComponent field = ((JSpinner.DefaultEditor) this.getEditor());
	    Dimension prefSize = field.getPreferredSize();
	    prefSize = new Dimension(50, prefSize.height);
	    field.setPreferredSize(prefSize);
	}
}
