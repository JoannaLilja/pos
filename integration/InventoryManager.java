package integration;

import java.util.LinkedList;

import model.purchase.Item;

public class InventoryManager
{

	public InventoryManager()
	{
		
	}
	
	public Item getItem(int id)
	{
		if(id == 0)
			return new Item(0, 10, "green shirt"); 
		if(id == 1)
			return new Item(1, 10, "purple plums");
		if(id == 2)
			return new Item(2, 10, "apple, Spain");
		if(id == 3)
			return new Item(3, 10, "blue jeans");
		if(id == 4)
			return new Item(4, 10, "mysterious item");
		if(id == 5)
			return new Item(5, 10, "very mysterious item");
		if(id == 6)
			return new Item(6, 10, "mysteriously mysterious item");
		if(id == 7)
			return new Item(7, 10, "mysterious item of mystery");
		if(id == 8)
			return new Item(8, 10, "mysteriously mysterious item of mystery");
		if(id == 9)
			return new Item(9, 10, "mysteriously long description of mysterious item");
		if(id == 10)
			return new Item(10, 10, "PANSAKES");
		else
			return new Item(-1, 0, "unknown item");

	}

	public void clearItems(LinkedList<Item> items) 
	{
		System.out.println("Items cleared from inventory. ");
	}
	
}
