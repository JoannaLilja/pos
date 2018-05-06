package integration;

public class DiscountDTO 
{

	private int id;
	private double multiplier;
	
	DiscountDTO(int id, double multiplier)
	{
		this.id = id;
		this.multiplier = multiplier;	
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getMultiplier()
	{
		return multiplier;
	}
	
}
