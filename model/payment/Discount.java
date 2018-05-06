package model.payment;

import integration.DbHandler;
import integration.DiscountDTO;

public class Discount
{
	
	private DbHandler db = new DbHandler();
	
	private int id;
	private double multiplier;
	
	private boolean valid = false;
	
	Discount(int id)
	{
		DiscountDTO discountDTO = db.getDiscount(id);
		this.id = discountDTO.getId();
		this.multiplier = discountDTO.getMultiplier();
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getMultiplier()
	{
		return multiplier;
	}
	
	public boolean isValid()
	{
		return valid;
	}

	public boolean validate(int userId) 
	{
		
		valid = db.validateDiscount(this.id, userId);
		return valid;
	}

}
