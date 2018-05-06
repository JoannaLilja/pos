package model.purchase;

public class Price
{
	double price;
	Tax tax;
	
	Price(double price)
	{
		this.price = price;
		tax = new Tax(price);
	}
	
	public double getAmount()
	{
		return price;
	}
	

	public Tax getTax() 
	{
		return tax;
	}

}
