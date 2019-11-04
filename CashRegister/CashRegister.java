import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.*;   //Needed to format double numbers to 2 places

// Create a CashRegister class that represents the cash register and its contents.  The CashRegister class 
// will keep track of the different currency and coins in the cash register.  You need a method to 
// tell you what money is in the cash register.
//
public class CashRegister
{
	// Create instance variables to keep track of the money (each currency/coin) in the cash register, 
	
	// the money (each currency/coin) received,
	
	// and the purchase amount 	

	private ArrayList<Money> money = new ArrayList<Money>(); // This keeps track of all the money in the register

	private DecimalFormat moneyFormat = new DecimalFormat("$0.00");  // Money format: 2 decimals with $
	private DecimalFormat decFormat = new DecimalFormat("#.##");     // Decimal format: 2 decimals
	
	public CashRegister(ArrayList<Money> startMoney)
	{
		// This is the constructor.  The array list parameter is full of Money objects.  Since the money 
		// needs to be separated, You will also need to sort the money array list in reverse order.
		// This ArrayList can be sorted since Money implements Comparable and and the compareTo method is defined
                Collections.sort(startMoney);
		Collections.reverse(startMoney);
                money = startMoney;
	}
	
	public double getTotalMoneyInRegister()
	{
		// Calculate the total amount of money in the cash register
		double total = 0;
                for(Money m : money)
                {
                    total += m.getValue();
                }
                return total;
	}

	public void printAmountInRegister()
	{
		// Print out the total amount of each currency in the cash register.  There should be a separate line per currency.
                ArrayList<String> curr = new ArrayList<String>();
                curr.add("20 dollar bill");curr.add("10 dollar bill");curr.add("5 dollar bill");curr.add("one dollar bill");
                curr.add("quarter");curr.add("dime");curr.add("nickel");curr.add("penny");
                ArrayList<Money> same = new ArrayList<Money>();
                for(int j = 0; j<curr.size();j++)
                {
                    same.removeAll(same);
		for(int i = 0; i<money.size(); i++)
		{
		    if(money.get(i).getType().equals(curr.get(j)))
		    same.add(money.get(i));
		}
		double total = 0;
		for(Money k : same)
		{
		    total += k.getValue();
		}
		total = Double.valueOf(decFormat.format(total));
		System.out.println(curr.get(j)+" amount: "+moneyFormat.format(total));
              }
	}
}
