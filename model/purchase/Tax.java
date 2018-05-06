package model.purchase;

public class Tax
{

	double tax;
	
	Tax(double price)
	{
		tax = price*0.123;
	}
	
	public double getAmount()
	{
		return tax;
	}
	
	
}
