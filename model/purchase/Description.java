package model.purchase;

public class Description 
{
	
	private String description;
	
	Description(String description)
	{
		this.description = description;
	}
	
	@Override
	public String toString()
	{
		return description;
	}
	
}
