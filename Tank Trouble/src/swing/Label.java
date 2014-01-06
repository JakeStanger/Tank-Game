package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Label extends JLabel
{
	public Label(String text)
	{
		this.setSize(100, 20);
		this.setText(text);
		
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.CENTER);
		
		//Change the appearance
		Font font = new Font("ARMY RUST", Font.BOLD, 32);
		this.setFont(font);
		this.setForeground(Color.BLACK);
		
		System.out.println("Label class loaded");
	}
}
