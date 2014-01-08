package menu;
import info.Error;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import main.Window;

public class Todo 
{
	public Todo()
	{
		Window.txtTodo.setSize(500, 500);
		Window.txtTodo.setEditable(false);
		
		Window.pnlTodo.add(Window.txtTodo);
		readTodo();
		Window.switchTo("Todo List");
		System.out.println("Loading todo list");
	}
	
	public void readTodo()
	{
		try
		{
			FileReader version = new FileReader( "src/info/todo.rtf" ) ;
			BufferedReader bufferV = new BufferedReader(version);
			String versionS = "" ;

			while( (versionS = bufferV.readLine()) != null)
			{
				Window.txtTodo.setText(versionS);
			}

			bufferV.close();
		}
		catch( IOException e )
		{
			new Error("reading version file.");
		}
	}
}
