package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import swing.Button;
import swing.Label;

public class Window
{
	public static JFrame frame = new JFrame("Tank Game"); //Create the JFrame
	
	public static JPanel pnlMaster = new JPanel(new CardLayout()); //The master JPanel upon which everything is placed

	//Create the JPanels for the main menu
	public static JPanel pnlMenu = new JPanel(new GridLayout(1,5));
	public static JPanel pnlMenu2 = new JPanel(new FlowLayout(FlowLayout.LEADING));

	//Create the JPanels for the options screen
	public static JPanel pnlOptions = new JPanel();
	public static JPanel pnlAudio = new JPanel();

	//Create the JPanels for the game
	public static JPanel pnlGame = new JPanel();

	//Create the buttons for the main menu
	public static Button btnPlayS = new Button("Play Singleplayer");
	public static Button btnPlayM = new Button("Play Multiplayer");
	public static Button btnOptions = new Button("Options");
	public static Button btnFiller = new Button("Filler Button");
	public static Button btnExit = new Button("Quit Game");

	//Create the buttons for the options menu
	public static swing.Button btnGraphics = new Button("Graphics");
	public static Button btnSound = new Button("Audio");
	public static Button btnControls = new Button("Controls");
	public static Button btnCustomize = new Button("Customization");

	public static Button btnBack = new Button("Back to Main Menu"); //Back button (leads to main menu whenever clicked)

	public static Label lblVersion = new Label("Version has not loaded properly"); //The version label. Gets automatically updated to the latest version.
	
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
	    GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(frame); //Makes the application go fullscreen

	    frame.getContentPane().add(pnlMaster);

	    
	    switchTo("Main Menu");

	    //Some general layout stuff
	    pnlOptions.setLayout(new BoxLayout(pnlOptions, BoxLayout.Y_AXIS));
	    pnlAudio.setLayout(new SpringLayout());

	    //The BoxLayout for the main menu's buttons
	    Box box = Box.createVerticalBox();
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.btnPlayS);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.btnPlayM);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.btnOptions);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.btnFiller);
	    box.add(Box.createVerticalStrut(50));
	    box.add(Window.btnExit);
	    box.add(Box.createVerticalStrut(50));

	    //Creates empty panels to shift things around
	    pnlMenu.add(new JPanel());
	    pnlMenu.add(new JPanel());
	    pnlMenu.add(box);
	    pnlMenu.add(new JPanel());
	    pnlMenu.add(new JPanel());

	    pnlMenu2.add(Window.lblVersion);
	    
	    //A special panel to hold the two panels with visible content (one with buttons and one with the version label) together in a borderlayout
	    JPanel masterMini1 = new JPanel(new BorderLayout());
	    masterMini1.add(pnlMenu, BorderLayout.CENTER);
	    masterMini1.add(pnlMenu2, BorderLayout.SOUTH);
	    
	    //Adds the panels to the master panel so they can be switched between with the cardlayout
	    pnlMaster.add(masterMini1, "Main Menu");
	    pnlMaster.add(pnlOptions, "Options");
	    pnlMaster.add(pnlGame, "Game");
	    pnlMaster.add(pnlAudio, "Audio");

	    System.out.println("Window class loaded");

	}
	
	public static void switchTo(String pnlName) //A small method to make changing card easier
	{
		Window.cards.show(pnlMaster,pnlName);
	}
}