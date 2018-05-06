package integration;


public class DbHandler 
{
	
	/**
	 * Adds a log entry to the database
	 * @param LogEntry entry
	 */
	void addLogEntry(LogEntry entry)
	{
		System.out.println("Entry added to logs. ");
	}
	
	/**
	 * Would contain an SQL query or something asking the database if the user userId is eligible for discount discountId. 
	 * However, this one just returns true every time without any database connection. 
	 * @param discountId
	 * @param userId
	 * @return valid
	 */
	public boolean validateDiscount(int discountId, int userId)
	{
		return true;
	}
	
	/**
	 * Would contain an SQL query or something asking the database for discount of id id. 
	 * However, this one just returns a variety of examples without any database connection. 
	 * @param id
	 * @return discountDTO
	 */
	public DiscountDTO getDiscount(int id)
	{
		if(id == 1)
			return new DiscountDTO(1, 0.8);
		if(id == 2)
			return new DiscountDTO(2, 0.7);
		
		return new DiscountDTO(3, 0.9);
	}
	
}
