package menu;
import java.awt.Dimension;

import main.Window;

public class Todo 
{
	public Todo()
	{
		Window.txtTodo.setPreferredSize(new Dimension(1000, 1000));
		Window.txtTodo.setEditable(false);
		
		Window.pnlTodo.add(Window.txtTodo);
		readTodo();
		Window.switchTo("Todo List");
		System.out.println("Loading todo list");
	}
	
	public void readTodo()
	{
		//TODO Make a table or something for a todo list
	}
}
