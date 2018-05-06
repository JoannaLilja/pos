package integration;

import model.purchase.Purchase;

public class PurchaseUpdate
{
	

	Purchase purchase;
	
	
	public PurchaseUpdate(Purchase purchase)
	{
		this.purchase = purchase;
	}
	
	public void run()
	{
		
		LogEntry entry = new LogEntry(purchase);
		InventoryManager im = new InventoryManager();
		AccountManager am = new AccountManager();
		
		im.clearItems(purchase.getItems());
		am.updateAcount(purchase);
		entry.enter();
		
		
	}

}
