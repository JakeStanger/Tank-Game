package swing;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JSlider;

@SuppressWarnings("serial")
public class Slider extends JSlider
{
	public Slider()
	{
		this.setPreferredSize(new Dimension(500,50));
		
		Font font = new Font("ARMY RUST", Font.BOLD, 24);
		this.setFont(font);
		
		this.setMajorTickSpacing(10);
		this.setMinorTickSpacing(1);
		this.setPaintTicks(true);
		this.setPaintLabels(true);
		
	}
}
