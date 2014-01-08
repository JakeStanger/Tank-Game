package game;

public class GameTick 
{
	public static boolean tick;
	public static boolean gameIsRunning = true;
	
	public GameTick() throws InterruptedException
	{
		while(GameTick.gameIsRunning = true)
		{
			tick = false;
			Thread.sleep(50);
			tick = true;
		}
	}
}
