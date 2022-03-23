package recurringdepositcalculator;

import java.util.Scanner;

public class RecurringDepositCalImpl implements RecurringDepositCalc {
	
	@Override
	public String RDCalc() {
		
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter Principle amount :");
		  int principle = scanner.nextInt();
		  
		  System.out.println("Enter interest rate :");
		  float rate = scanner.nextFloat();
		  
		  System.out.println("Enter duration (4 quarters = 1 year) :");
		  int duration = scanner.nextInt();
		 
		  float rate2 = 1+rate/400;
		  float maturity = (float)Math.pow(rate2, duration)-1;
		  float maturity1 = maturity*principle;
		  float maturity2 = 1/(float)Math.pow(rate2,.33);
		  float maturity3 = 1-maturity2;
		 
		  float maturity4 = maturity1/maturity3;
		  System.out.println("Maturity :"+maturity4);
		  
		return "";	
	}

}
