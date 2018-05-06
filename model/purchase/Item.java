package model.purchase;

public class Item 
{
	
	private int id;
	private int count;
	private Description desc;
	private Price price;
	
	public Item(int id, double price, String desc)
	{
		this.id = id;
		this.count = 1;
		this.desc = new Description(desc);
		this.price = new Price(price);
	}

	public int getId()
	{
		return id;	
	}
	public int getCount()
	{
		return count;	
	}
	public Description getDescription()
	{
		return desc;
	}
	public Price getPrice()
	{
		return price;
	}
	public void incrementCount()
	{
		count++;
	}

}
