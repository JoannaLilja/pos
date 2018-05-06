package model.payment;

import integration.Printer;
import model.purchase.Purchase;

public class Payment
{

	private double total;
	private double amountPaid;
	private Discount discount;
	private Receipt receipt;
	
	public Payment(Printer printer)
	{
		this.receipt = new Receipt(printer);
	}
	
	
	/**
	 * Getter for total. 
	 * @return total
	 */
	public double getTotal()
	{
		return total;	
	}
	
	/**
	 * Getter for amountPaid
	 * @return amountPaid
	 */
	public double getAmountPaid()
	{
		return amountPaid;	
	}
	
	/**
	 * Getter for discount. 
	 * @return discount
	 */
	public Discount getDiscount() 
	{
		return discount;
	}
	
	/**
	 * Returns true if a discount exists and has been validated. 
	 * @return
	 */
	public boolean hasDiscount()
	{
		return !(discount == null);
	}
	
	/**
	 * Adds amount to total of Payment
	 * @param amount
	 */
	public void addToTotal(double amount)
	{
		total += amount;
	}
	
	/**
	 * Gets a new discount. Discount class communicates with DbHandler to get discount info. 
	 * @param discountId
	 */
	public void enterDiscount(int discountId)
	{
		discount = new Discount(discountId);
	}
	
	/**
	 * Calculates the discounted value of a given price
	 * @param price
	 * @return discountedPrice
	 */
	public double getDiscountedAmount()
	{
		if (hasDiscount())
			if(discount.isValid())
				return total * discount.getMultiplier();
		return total;
	}

	/**
	 * Takes the amount paid by the customer and returns the change. Also tells the receipt to print. 
	 * @param amount
	 * @param purchase
	 * @return change
	 */
	public double pay(double amount, Purchase purchase)
	{
		amountPaid = amount;
		receipt.print(purchase);
		
		if (hasDiscount())
			if(discount.isValid())
				return amount - total * discount.getMultiplier();		
		return amount-total;

	}

	/**
	 * 
	 */
	public void reset()
	{
		total = 0;
		discount = null;
	}

	public double getChange()
	{
		if (hasDiscount())
			if(discount.isValid())
			{
				System.out.println(amountPaid);
				return amountPaid - (total * discount.getMultiplier());
			}
		System.out.println(discount.isValid());
		return amountPaid-total;
	}

	
	
}
