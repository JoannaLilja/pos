package model.purchase;

import java.util.LinkedList;
import integration.Printer;
import integration.PurchaseUpdate;
import model.payment.Payment;
import integration.InventoryManager;

public class Purchase
{
	
	Payment payment;

	InventoryManager im = new InventoryManager();
		
	LinkedList<Item> items = new LinkedList<Item>();
	
	
	public Purchase(Printer printer)
	{
		payment = new Payment(printer);
	}
	
	public Payment getPayment()
	{
		return payment;
	}
	
	public LinkedList<Item> getItems()
	{
		return items;
	}
	
	public DisplayItems addItem(int id)
	{
		Item foundItem = null;
		Item newItem;
		
		for(Item item : items)
		{
			if(item.getId() == id)
			{
				foundItem = item;
				break;
			}
		}
		
		if(foundItem != null)
		{
			foundItem.incrementCount();
			payment.addToTotal(foundItem.getPrice().getAmount());
			payment.addToTotal(foundItem.getPrice().getTax().getAmount());

		}
		else
		{
			newItem = im.getItem(id);
			items.add(newItem);
			payment.addToTotal(newItem.getPrice().getAmount());
			payment.addToTotal(newItem.getPrice().getTax().getAmount());

		}
		
		return new DisplayItems(items, payment.getTotal());
		
	}
	
	public void finalize()
	{
		
		PurchaseUpdate update = new PurchaseUpdate(this);
		
		update.run();
		
		
		
	}
	
	public void reset()
	{
		items.clear();
		payment.reset();
	}


	
}
