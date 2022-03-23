package com.mtit.service;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverterImpl implements CurrencyConverter{

Scanner scanner = new Scanner(System.in);
	
	@Override
	public String CurrencyConverter1() {
		
		double amount;
	      double dollar,euro,rupee,yen;
	      int abc;
	      
	 
	      DecimalFormat f = new DecimalFormat("##.##");
	      
	 
	      Scanner sc = new Scanner(System.in);
	      
	 
	      System.out.println("Currency Types:");
	      System.out.println("Enter 1: Ruppe(lkr)");
	      System.out.println("Enter 2: Dollar(USD)");
	      System.out.println("Enter 3: Euro");
	      System.out.println("Enter 4: Yen");
	      
	 
	      System.out.print("\nPlease Select from above options: ");
	      abc = sc.nextInt();
	 
	      System.out.println("Enter the amount you want to convert?");
	      amount = sc.nextFloat();
	 
	      switch (abc)
	      {
	      
	      		//rupee conversion
	         case 1:  
	        	 //lkr to usd
	            dollar = amount / 254;
	            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
	            //lkr to euro
	            euro = amount / 277;
	            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
	 
	            //lkr to yen
	            yen = amount / 2.17;
	            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
	            break;
	            
	            
	 
	            //doller conversion
	         case 2:  
	        	 //dolller to lkr
	            rupee = amount * 254;
	            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
	            
	            //doller to euro
	            euro = amount *0.92 ;
	            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
	 
	            //doller to yen
	            yen = amount *117.32;
	            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
	            break;
	            
	            

	            //euro conversion
	         case 3:  
	        	 //euro to lkr
	            rupee = amount * 277;
	            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
	 
	            //euro to usd
	            dollar = amount *1.09;
	            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
	 
	            //euro to yen
	            yen = amount *127.98;
	            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
	            break;
	            
	            
	 
	            // yen conversion
	         case 4:  
	        	 //yen to lkr
	            rupee = amount *2.17;
	            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
	 
	            //yen to usd
	            dollar = amount *0.0085;
	            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
	 
	            //yen to euro
	            euro = amount *0.0078;
	            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
	            break;
	 
	         
	 
	          //Default case
	         default:
	            System.out.println("Invalid Input Try Again!!!");
	      }
		return "";
	}
}
