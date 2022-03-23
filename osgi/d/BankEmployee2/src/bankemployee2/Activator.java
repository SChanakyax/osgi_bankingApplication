package bankemployee2;

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
		
System.out.println("Started Bank Calculator Service");
		
		serviceReference=context.getServiceReference(SimpleInterest.class.getName());
		SimpleInterest interest=(SimpleInterest) context.getService(serviceReference);
		System.out.println(interest.Simpleinterest());
			
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Thank you for using the Banking Calculator Service !!!");
		//context.ungetService(serviceReference);
	}

}
