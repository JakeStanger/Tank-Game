package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Button extends JButton
{

	public Button(String name)
	{
		//Set up the basics
		ImageIcon background = new ImageIcon("src/images/menu.png");
		this.setIcon(background);
		this.setText(name);
		this.setSize(300, 80);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.CENTER);
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Change the appearance
		Font font = new Font("ARMY RUST", Font.BOLD, 32);
		this.setFont(font);
		this.setForeground(Color.WHITE);
		
		//Remove the border
		Border emptyBorder = BorderFactory.createEmptyBorder();
		this.setBorder(emptyBorder);
	}
}
