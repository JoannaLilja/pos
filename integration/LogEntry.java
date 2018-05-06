package integration;

import model.purchase.Purchase;

class LogEntry
{
	
	DbHandler dbh = new DbHandler();
	
	Purchase purchase;
	
	LogEntry(Purchase purchase)
	{
		this.purchase = purchase;
	}

	public void enter() 
	{
		dbh.addLogEntry(this);
	}

}
