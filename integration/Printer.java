package integration;

import java.util.LinkedList;

import model.purchase.Item;
import model.purchase.Purchase;

public class Printer 
{
	
	/**
	 * Prints a receipt for a purchase to the console
	 * @param testLines
	 */
	public void printReceipt(LinkedList<String> textLines)
	{
		
		int longestLineLength;
		
		
		longestLineLength = longestLine(textLines);
		
		System.out.println("\nReceipt: ");
		
		printDashes(longestLineLength + 8); System.out.println();
		for (String line : textLines)
		{
			System.out.print("|   ");
			System.out.print(line); printSpaces(longestLineLength-line.length());
			System.out.print("   |\n");
		}
		printDashes(longestLineLength + 8);
		
	}
	
	private void printSpaces(int numOfSpaces)
	{
		for(int n = 0; n < numOfSpaces; n++)
			System.out.print(" ");
	}
	private void printDashes(int numOfDashes)
	{
		for(int n = 0; n < numOfDashes; n++)
			System.out.print("-");
	}
	
	private int longestLine(LinkedList<String> textLines)
	{
		
		int maxLength = 0;
		
		for (String line : textLines)
			if (line.length() > maxLength)
				maxLength = line.length();
			
		return maxLength;
		
	}

}
