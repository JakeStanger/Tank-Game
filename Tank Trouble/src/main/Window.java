package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import swing.Button;
import swing.Label;

public class Window
{
	public static JFrame frame = new JFrame("Tank Game");
	
	public static JPanel pnlMaster = new JPanel(new CardLayout()); //The master JPanel upon which everything is placed

	//Create the JPanels for the main menu
	public static JPanel pnlMenu = new JPanel(new GridLayout(1,5));
	public static JPanel pnlMenu2 = new JPanel(new FlowLayout(FlowLayout.LEADING));

	//Create the JPanels for the options screen
	public static JPanel pnlOptions = new JPanel();

	//Create the JPanels for the game
	public static JPanel pnlGame = new JPanel();

	public static Button playS = new Button("Play Singleplayer");
	public static Button playM = new Button("Play Multiplayer");
	public static Button options = new Button("Options");
	public static Button language = new Button("Language");
	public static Button exit = new Button("Quit Game");

	public static swing.Button btnGraphics = new Button("Graphics");
	public static Button btnSound = new Button("Audio");
	public static Button btnControls = new Button("Controls");
	public static Button btnCustomize = new Button("Customization");

	public static Button btnBack = new Button("Back to Main Menu");

	public static Label lblVersion = new Label("Version has not loaded properly");
	
	public static CardLayout cards = (CardLayout)pnlMaster.getLayout(); //Creating the cardlayout

	public Window()
	{
	    //Create the JFrame
	    frame.pack();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	    //Changes the frame size to your screen size
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) (dimension.getWidth());
	    int y = (int) (dimension.getHeight());
	    frame.setSize(x,y);
	    frame.setResizable(false);
	    //GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this); //Makes the application go fullscreen

	    frame.getContentPane().add(pnlMaster);

	    
	    switchTo("Main Menu");

	    pnlOptions.setLayout(new BoxLayout(pnlOptions, BoxLayout.Y_AXIS));

	    Box box = Box.createVerticalBox();
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.playS);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.playM);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.options);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.language);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.exit);
	    box.add(Box.createVerticalStrut(50));

	    pnlMenu.add(new JPanel());
	    pnlMenu.add(new JPanel());
	    pnlMenu.add(box);
	    pnlMenu.add(new JPanel());
	    pnlMenu.add(new JPanel());

	    pnlMenu2.add(Window.lblVersion);
	    
	    JPanel masterMini1 = new JPanel(new BorderLayout());
	    masterMini1.add(pnlMenu, BorderLayout.CENTER);
	    masterMini1.add(pnlMenu2, BorderLayout.SOUTH);
	    
	    pnlMaster.add(masterMini1, "Main Menu");
	    pnlMaster.add(pnlOptions, "Options");
	    pnlMaster.add(pnlGame, "Game");


	    System.out.println("Window class loaded");

	}
	
	public static void switchTo(String pnlName)
	{
		Window.cards.show(pnlMaster,pnlName);
	}
}