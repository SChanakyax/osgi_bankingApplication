package recurringdepositcalculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println("Recurring Deposit Calculator Start");
		RecurringDepositCalc publisherService = new RecurringDepositCalImpl();
		publishServiceRegistration = context.registerService(
				RecurringDepositCalc.class.getName(), publisherService, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Recurring Deposit Calculator Stop");
		publishServiceRegistration.unregister();
	}

}
