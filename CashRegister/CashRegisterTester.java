import java.util.ArrayList;
import java.text.*;   //Needed to format double numbers to 2 places

// This driver program should create a new Money object for each currency or coin
// in a cash register (from a penny to a twenty dollar bill).
// It should then initialize the cash register with some money and print out the 
// contents of the cash register.
//
public class CashRegisterTester
{
	public static void main( String[] args )
	{
		DecimalFormat decFormat = new DecimalFormat("$0.00");

		// Set up all possible types of money from a penny to a twenty dollar bill - here are a few examples:
		Money twentyDollars = new Money("20 dollar bill",20.00);
		Money tenDollars = new Money("10 dollar bill",10.00);
		Money fiveDollars = new Money("5 dollar bill",5.00);
		Money oneDollar = new Money("one dollar bill",1.00);
		Money quarter = new Money("quarter",.25);
		Money dime = new Money("dime",.1);
		Money nickel = new Money("nickel",.05);
		Money penny = new Money("penny",.01);

		// Initialize the cash register by sending it an array list of money (currency/coins)
		// You can set up a loop and populate the array list that way (possibly 10 of each currency or coin)

		ArrayList<Money>  cash = new ArrayList<Money>();  //This is the array list of money that needs to be populated
		//.......
		for(int i = 0; i<5;i++)
		{
                cash.add(nickel);
                cash.add(penny);
                cash.add(tenDollars);
                cash.add(twentyDollars);
                cash.add(fiveDollars);
                cash.add(oneDollar);
                cash.add(dime);
                cash.add(quarter);
            }
                
		CashRegister register = new CashRegister(cash);  //Instantiates the cash register with money.

		// Show what is in cash register
		System.out.println("\n"+"The cash register contains "+decFormat.format(register.getTotalMoneyInRegister())+" :");
		register.printAmountInRegister();	//Shows the amount of each currency
	}
}

