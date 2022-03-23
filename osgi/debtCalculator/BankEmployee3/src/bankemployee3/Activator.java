package bankemployee3;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.service.CurrencyConverter;

import publisher2.SimpleInterest;
import publisher3.DebtCalc;
import recurringdepositcalculator.RecurringDepositCalc;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		
		serviceReference=context.getServiceReference(DebtCalc.class.getName());
		DebtCalc debt=(DebtCalc) context.getService(serviceReference);
		System.out.println(debt.LoanCalc());
			
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Thank you for using the Banking Calculator Service !!!");
		//context.ungetService(serviceReference);
	}

}
