package startup;


import view.View;
import controller.Controller;
import integration.Printer;


public class Main 
{

	public static void main(String[] args) 
	
	{
		
		Printer printer = new Printer();
		Controller contr = new Controller(printer);
		View view = new View(contr);
		
	}

}

