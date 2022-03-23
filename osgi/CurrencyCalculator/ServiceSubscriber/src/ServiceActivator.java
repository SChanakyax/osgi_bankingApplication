import java.util.Scanner;

//import publisher2.SimpleInterest;
//import publisher3.DebtCalc;
//import recurringdepositcalculator.RecurringDepositCalc;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.service.CurrencyConverter;



public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		
		/*ServiceReference serviceReference;

		Scanner scanner = new Scanner(System.in);
		int input;*/

		System.out.println("Started Bank Calculator Service");
		
		serviceReference=context.getServiceReference(CurrencyConverter.class.getName());
		CurrencyConverter currency=(CurrencyConverter) context.getService(serviceReference);
		System.out.println(currency.CurrencyConverter1());
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Thank you for using the Banking Calculator Service !!!");
		//context.ungetService(serviceReference);
	}
}
