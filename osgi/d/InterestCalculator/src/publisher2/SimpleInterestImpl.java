package publisher2;

import java.util.Scanner;

public class SimpleInterestImpl implements SimpleInterest {

	@Override
	public String Simpleinterest() {
		// create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the Initial Deposit : ");
	    double deposit = input.nextDouble();

	    System.out.print("Enter the rate : ");
	    double irate = input.nextDouble();

	    System.out.print("Enter the terms in months: ");
	    double months = input.nextInt();

	    double sinterest = (deposit * months * irate) / 100;
	    
	     double total = sinterest + deposit;
		
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("Initial Deposit : " + deposit + "  Interest Rate : " + irate + "  Duration in months : " + months);
	    
	    System.out.println();
	    
	    System.out.println("Simple Interest for "+ (int)months + " months : " + sinterest);
	    
	    System.out.println();
	    
	    System.out.println("Total After maturity : " + total);
	    

	   
		return "";
	}

	
//2-consumer,5-interest,3-currency
	
}
