/*
Haley Sanchez
*/
public class Money implements Comparable
{
	private String type;	//type of currency
	private double value;	//value of money
	
	public Money(String moneyType, double val)
	{
		// Initialize the instance variables
                type = moneyType;
                value = val;
	}
	
	public int compareTo(Object obj)
	{
		// Create a compareTo() method to determine how to compare a Money object.
		// Use the value of the money to determine whether it is less than, equal, or 
		// greater than the other money

		Money other = (Money) obj;
                if(value == other.value)
                return 0;
                if(value < other.value)
                return 1;
                return -1;

	}
	
	public boolean equals(Object obj)
	{
		   Money other = (Money) obj;
		   if (value == other.value)
			return true;
		   return false;
	}
	
	public double getValue()
	{
		// get the value of the money
                return value;
	}
	
	public String getType()
	{
		// get the type of money
                return type;
	}
	
	public String toString()
	{
		// return the value of the money
                return value+" "+type;
	}
}
