package controller;

import integration.Printer;
import model.purchase.DisplayItems;
import model.purchase.Purchase;

/**
 * Handles the flow from View to the Model
 */
public class Controller 
{
	private Purchase purchase;
	
	
	public Controller(Printer printer)
	{
		purchase = new Purchase(printer);	
	}
	
	public Purchase getPurchase()
	{
		return purchase;
	}
	/**
	 * 
	 * @param itemId
	 * @return Items and current total
	 */
	public DisplayItems addItem(int id)
	{
		return purchase.addItem(id);
	}
	
	public void enterDiscount(int discountId)
	{
		purchase.getPayment().enterDiscount(discountId);
	}
	
	public boolean validateDiscount(int customerId)
	{
		return purchase.getPayment().getDiscount().validate(customerId);
	}
	
	/**
	 * Pays amount and returns change based on total of Purchase. 
	 * @param amount
	 * @return change
	 */
	public double pay(double amount)
	{
		purchase.finalize();
		return purchase.getPayment().pay(amount, purchase);
	}
	
	/**
	 * Clears the current sale. 
	 */
	public void startSale()
	{
		purchase.reset();
	}

}
