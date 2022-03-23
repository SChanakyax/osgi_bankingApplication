package publisher3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class DebtCalcImpl implements DebtCalc {

	@Override
	public String LoanCalc() {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	      
        BufferedReader in = new BufferedReader(reader);

        double loan;
        do{
            System.out.println("Enter Loan amount: ");
            String loanAmount = null;
			try {
				loanAmount = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            loan = Double.parseDouble(loanAmount);
            if(loan <= 99){
                System.out.println("Loan amount must be greater than $99\n");
            }
        }while(loan <= 99);

        int term;
        do{
            System.out.println("Enter Loan term in years: ");
            String termInYears = null;
			try {
				termInYears = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            term = Integer.parseInt(termInYears);
            if(term <= 0){
                System.out.println("Loan term must be at least one year\n");
            }
            else if(term > 50){
                System.out.println("Loan term cannot exceed 50 years\n");
            }
        }while(term <=0 || term > 50);       

        double rate;
        do{
            System.out.println("Enter Interest rate per year: ");
            String annualRate = null;
			try {
				annualRate = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            rate = Double.parseDouble(annualRate);
            if(rate < 0){
                System.out.println("Interest rate cannot be negative\n");
            }            
        }while(rate < 0);

        double downPay;
        do{
            System.out.println("Enter Downpayment: ");
            String downPayment = null;
			try {
				downPayment = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            downPay = Double.parseDouble(downPayment);
            if(downPay < 0){
                System.out.println("Downpayment cannot be negative, but can be $0\n");
            }
            else if(downPay>=loan){
                System.out.println("Downpayment cannot equal or exceed your loan amount\n");
            }
        }while(downPay < 0 || downPay >= loan);
        System.out.println();
       
        
        
        double monthlyPayment = MonthlyPayment(loan, term, rate, downPay);
        double totalInterestAccrued = InterestAccrued(monthlyPayment, loan, downPay, term);
        
        
        System.out.println("Monthly Payments: ");
        System.out.print("Rs. ");
        System.out.printf("%.2f", monthlyPayment);
        System.out.println();
        System.out.println("Total Accrued Interest: ");
        System.out.println("Rs. " + (int)Math.round(totalInterestAccrued));
		return "";		
	}
	public static double InterestAccrued(double monthlyPayment, double loan, double downPay, int term)
    {
        int termsInMonths = term * 12;
        loan -= downPay;
        double totalCost = monthlyPayment * termsInMonths;
        double totalInterestAccrued = totalCost - loan;
        return totalInterestAccrued;
		
	}
	

   
	public static double MonthlyPayment(double loan, int term, double rate, double downPay )
    {
        double monthlyRate = (rate/100.0) / 12;
        int termsInMonths = term * 12;
        loan -= downPay;
        double monthlyPayment = (monthlyRate * loan)/(1-Math.pow((1+monthlyRate), -termsInMonths));
        return monthlyPayment;
    }
}
